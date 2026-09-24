package org.apache.commons.math.linear;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector10);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector14.mapAsinToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and realVector15.", arrayRealVector10.equals(realVector15) == realVector15.equals(arrayRealVector10));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog1pToSelf();
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray18, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector22.mapLog1pToSelf();
        arrayRealVector22.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector22.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector20, arrayRealVector22);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector16, (org.apache.commons.math.linear.RealVector) arrayRealVector27);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector10.projection((org.apache.commons.math.linear.RealVector) arrayRealVector27);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector14.", arrayRealVector10.equals(openMapRealVector14) == openMapRealVector14.equals(arrayRealVector10));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector3.append(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double8 = openMapRealVector4.dotProduct(openMapRealVector7);
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector7.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = openMapRealVector7.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector7.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapLog1pToSelf();
        arrayRealVector13.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector7.append((org.apache.commons.math.linear.RealVector) arrayRealVector13);
        double double18 = openMapRealVector1.getDistance(openMapRealVector17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector13 and openMapRealVector17.", arrayRealVector13.equals(openMapRealVector17) == openMapRealVector17.equals(arrayRealVector13));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.append(openMapRealVector9);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector8.mapTan();
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector8.mapRintToSelf();
        double double13 = openMapRealVector8.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector8, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector1.append((org.apache.commons.math.linear.RealVector) openMapRealVector8);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator17 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry18 = openMapRealVector8.new OpenMapEntry(iterator17);
        boolean boolean20 = openMapRealVector8.isDefaultValue((double) ' ');
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector8.mapAtan();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector23.mapSinToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector8.append((org.apache.commons.math.linear.RealVector) arrayRealVector23);
        double double27 = openMapRealVector8.getSparcity();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector23 and openMapRealVector26.", arrayRealVector23.equals(openMapRealVector26) == openMapRealVector26.equals(arrayRealVector23));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector14.", arrayRealVector10.equals(openMapRealVector14) == openMapRealVector14.equals(arrayRealVector10));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector10);
        double[] doubleArray15 = arrayRealVector10.getData();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector14.", arrayRealVector10.equals(openMapRealVector14) == openMapRealVector14.equals(arrayRealVector10));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.append(openMapRealVector9);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector8.mapTan();
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector8.mapRintToSelf();
        double double13 = openMapRealVector8.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector8, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector1.append((org.apache.commons.math.linear.RealVector) openMapRealVector8);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator17 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry18 = openMapRealVector8.new OpenMapEntry(iterator17);
        boolean boolean20 = openMapRealVector8.isDefaultValue((double) ' ');
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector8.mapAtan();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector23.mapSinToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector8.append((org.apache.commons.math.linear.RealVector) arrayRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector26, (int) (byte) 10);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector23 and openMapRealVector26.", arrayRealVector23.equals(openMapRealVector26) == openMapRealVector26.equals(arrayRealVector23));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector6.projection(realVector11);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector6.mapSubtract((double) 100L);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector6.mapCosh();
        boolean boolean16 = arrayRealVector6.isNaN();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector17.append(openMapRealVector18);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector18.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector21.append(openMapRealVector22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector18.add(openMapRealVector22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector25.append(openMapRealVector26);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector25.mapTan();
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector25.mapRintToSelf();
        double double30 = openMapRealVector25.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector25, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector18.append((org.apache.commons.math.linear.RealVector) openMapRealVector25);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator34 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry35 = openMapRealVector25.new OpenMapEntry(iterator34);
        boolean boolean37 = openMapRealVector25.isDefaultValue((double) ' ');
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector25.mapAtan();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector40.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector40.mapSinToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector25.append((org.apache.commons.math.linear.RealVector) arrayRealVector40);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector6.append((org.apache.commons.math.linear.RealVector) openMapRealVector25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector43.", arrayRealVector1.equals(openMapRealVector43) == openMapRealVector43.equals(arrayRealVector1));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapLog1pToSelf();
        arrayRealVector5.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector5.subtract(arrayRealVector10);
        double[] doubleArray19 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector10.data = doubleArray19;
        double[] doubleArray21 = arrayRealVector10.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector2.append(doubleArray21);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapLog1pToSelf();
        arrayRealVector24.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector29.mapLog1pToSelf();
        arrayRealVector29.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector34.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = arrayRealVector29.subtract(arrayRealVector34);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector24, arrayRealVector34);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector37.mapFloor();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray21, arrayRealVector37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector22.", arrayRealVector10.equals(openMapRealVector22) == openMapRealVector22.equals(arrayRealVector10));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog1pToSelf();
        arrayRealVector7.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5, arrayRealVector7);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, (org.apache.commons.math.linear.RealVector) arrayRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector16.append(openMapRealVector17);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector17.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector20.append(openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector17.add(openMapRealVector21);
        arrayRealVector12.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector25.append(openMapRealVector26);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector26.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double30 = openMapRealVector26.dotProduct(openMapRealVector29);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector29.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector29.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapLog1pToSelf();
        arrayRealVector35.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector29.append((org.apache.commons.math.linear.RealVector) arrayRealVector35);
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector35.mapSubtractToSelf((double) (-1.0f));
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector12.append(realVector41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector39.", arrayRealVector1.equals(openMapRealVector39) == openMapRealVector39.equals(arrayRealVector1));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 0);
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        arrayRealVector6.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector6.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector4, arrayRealVector6);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, (org.apache.commons.math.linear.RealVector) arrayRealVector11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector4.", arrayRealVector1.equals(openMapRealVector4) == openMapRealVector4.equals(arrayRealVector1));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector10);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector10.mapSubtractToSelf((double) (-1.0f));
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray17, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapLog1pToSelf();
        arrayRealVector21.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector21.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector19, arrayRealVector21);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = arrayRealVector10.add(arrayRealVector21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector14 and arrayRealVector21.", openMapRealVector14.equals(arrayRealVector21) == arrayRealVector21.equals(openMapRealVector14));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        arrayRealVector6.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = arrayRealVector6.subtract(arrayRealVector11);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, arrayRealVector11);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector15.append(openMapRealVector16);
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector16.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector19.append(openMapRealVector20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector16.add(openMapRealVector20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector20.append((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector25.append(openMapRealVector26);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector25.mapTan();
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector25.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector25.mapExpm1ToSelf();
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray31, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector25.projection(doubleArray31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector20.subtract(doubleArray31);
        arrayRealVector11.data = doubleArray31;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector11 and openMapRealVector15.", arrayRealVector11.equals(openMapRealVector15) == openMapRealVector15.equals(arrayRealVector11));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector5.append((double) 0.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapTanToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and realVector11.", openMapRealVector0.equals(realVector11) == realVector11.equals(openMapRealVector0));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, (-1.0d), (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector6);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector5 and arrayRealVector6.", openMapRealVector5.equals(arrayRealVector6) == arrayRealVector6.equals(openMapRealVector5));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapAcosToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector8);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector13.append(openMapRealVector14);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector14.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector17.append(openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector14.add(openMapRealVector18);
        boolean boolean22 = openMapRealVector20.isDefaultValue((double) 'a');
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector20.mapLog10();
        double double24 = openMapRealVector4.dotProduct(openMapRealVector20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector8 and openMapRealVector12.", arrayRealVector8.equals(openMapRealVector12) == openMapRealVector12.equals(arrayRealVector8));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector5.append((double) 0.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapSinToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and realVector11.", openMapRealVector0.equals(realVector11) == realVector11.equals(openMapRealVector0));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector10);
        double[] doubleArray15 = openMapRealVector14.toArray();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector14.", arrayRealVector10.equals(openMapRealVector14) == openMapRealVector14.equals(arrayRealVector10));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector5.append((double) 0.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapCbrtToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and realVector11.", openMapRealVector0.equals(realVector11) == realVector11.equals(openMapRealVector0));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector6.projection(realVector11);
        double[] doubleArray13 = arrayRealVector6.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector15.mapTanhToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector6, (org.apache.commons.math.linear.RealVector) openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector18.append(openMapRealVector19);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor21 = openMapRealVector18.iterator();
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector18.mapSinToSelf();
        double double23 = openMapRealVector18.getSparcity();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapLog1pToSelf();
        arrayRealVector25.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector30.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = arrayRealVector25.subtract(arrayRealVector30);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector25.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector25.checkVectorDimensions((int) (byte) 10);
        double[] doubleArray37 = arrayRealVector25.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector18.append(doubleArray37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector15.append(doubleArray37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector38.", arrayRealVector1.equals(openMapRealVector38) == openMapRealVector38.equals(arrayRealVector1));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapLog1pToSelf();
        arrayRealVector5.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector5.subtract(arrayRealVector10);
        double[] doubleArray19 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector10.data = doubleArray19;
        double[] doubleArray21 = arrayRealVector10.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector2.append(doubleArray21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector23.append(openMapRealVector24);
        double double26 = openMapRealVector23.getSparcity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector23.mapAddToSelf(1.0E-12d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector2.add(openMapRealVector28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector22.", arrayRealVector10.equals(openMapRealVector22) == openMapRealVector22.equals(arrayRealVector10));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector0.mapTan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = openMapRealVector0.copy();
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray5, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = openMapRealVector0.projection(doubleArray5);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = arrayRealVector10.subtract(arrayRealVector15);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector10.mapMultiplyToSelf((double) (short) 10);
        double[] doubleArray20 = arrayRealVector10.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray20, 3.1622776601683794E-12d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray5, doubleArray20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector22.", arrayRealVector10.equals(openMapRealVector22) == openMapRealVector22.equals(arrayRealVector10));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor3 = openMapRealVector0.iterator();
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector0.mapSinToSelf();
        double double5 = openMapRealVector0.getSparcity();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog1pToSelf();
        arrayRealVector7.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = arrayRealVector7.subtract(arrayRealVector12);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector7.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector7.checkVectorDimensions((int) (byte) 10);
        double[] doubleArray19 = arrayRealVector7.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector0.append(doubleArray19);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector0.mapLog10();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector7 and openMapRealVector20.", arrayRealVector7.equals(openMapRealVector20) == openMapRealVector20.equals(arrayRealVector7));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector1.mapMultiplyToSelf((double) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector1.mapSinhToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(realVector11);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog1pToSelf();
        arrayRealVector15.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector15.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector15.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        arrayRealVector23.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector28.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = arrayRealVector23.subtract(arrayRealVector28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector32.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector28.projection(realVector33);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector28.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = arrayRealVector15.projection(arrayRealVector28);
        double[] doubleArray37 = arrayRealVector28.getDataRef();
        openMapRealVector12.setSubVector(0, doubleArray37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector12 and arrayRealVector28.", openMapRealVector12.equals(arrayRealVector28) == arrayRealVector28.equals(openMapRealVector12));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor3 = openMapRealVector0.iterator();
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector0.mapSinToSelf();
        double double5 = openMapRealVector0.getSparcity();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog1pToSelf();
        arrayRealVector7.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = arrayRealVector7.subtract(arrayRealVector12);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector7.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector7.checkVectorDimensions((int) (byte) 10);
        double[] doubleArray19 = arrayRealVector7.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector0.append(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector7 and openMapRealVector20.", arrayRealVector7.equals(openMapRealVector20) == openMapRealVector20.equals(arrayRealVector7));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector10);
        java.lang.Class<?> wildcardClass15 = openMapRealVector14.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector14.", arrayRealVector10.equals(openMapRealVector14) == openMapRealVector14.equals(arrayRealVector10));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapUlpToSelf();
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, 0.0d);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector5.mapUlpToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector7.append(openMapRealVector8);
        double double10 = openMapRealVector7.getSparcity();
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector5.projection((org.apache.commons.math.linear.RealVector) openMapRealVector7);
        boolean boolean12 = arrayRealVector1.equals((java.lang.Object) openMapRealVector5);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector5.", arrayRealVector1.equals(openMapRealVector5) == openMapRealVector5.equals(arrayRealVector1));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 10, (int) ' ');
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapLog1pToSelf();
        arrayRealVector9.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = arrayRealVector9.subtract(arrayRealVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector4, arrayRealVector14);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector18.append(openMapRealVector19);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector19.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double23 = openMapRealVector19.dotProduct(openMapRealVector22);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector17, (org.apache.commons.math.linear.RealVector) openMapRealVector22);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapExpm1ToSelf();
        boolean boolean26 = arrayRealVector24.isNaN();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector24.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector24.mapTanh();
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector24.mapRint();
        boolean boolean30 = openMapRealVector2.equals((java.lang.Object) realVector29);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and arrayRealVector4.", openMapRealVector2.equals(arrayRealVector4) == arrayRealVector4.equals(openMapRealVector2));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector3.append(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector3.mapTan();
        double double7 = openMapRealVector1.getL1Distance(openMapRealVector3);
        double double8 = openMapRealVector3.getNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray11 = arrayRealVector10.getDataRef();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapLog1p();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapLog1pToSelf();
        arrayRealVector14.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = arrayRealVector14.subtract(arrayRealVector19);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector19.projection(realVector24);
        double[] doubleArray26 = arrayRealVector19.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100);
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector28.mapTanhToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector19, (org.apache.commons.math.linear.RealVector) openMapRealVector28);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector10.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector3.append(realVector31);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector3);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector32.", arrayRealVector10.equals(openMapRealVector32) == openMapRealVector32.equals(arrayRealVector10));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector1.mapAcosToSelf();
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapExpm1ToSelf();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapAsinToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector7.append(openMapRealVector8);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor10 = openMapRealVector7.iterator();
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector7.mapSinToSelf();
        double double12 = openMapRealVector7.getSparcity();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapLog1pToSelf();
        arrayRealVector14.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = arrayRealVector14.subtract(arrayRealVector19);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector14.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector14.checkVectorDimensions((int) (byte) 10);
        double[] doubleArray26 = arrayRealVector14.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector7.append(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector1.ebeMultiply(doubleArray26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector14 and openMapRealVector27.", arrayRealVector14.equals(openMapRealVector27) == openMapRealVector27.equals(arrayRealVector14));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapAcosToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector8);
        java.lang.String str13 = arrayRealVector8.toString();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector8 and openMapRealVector12.", arrayRealVector8.equals(openMapRealVector12) == openMapRealVector12.equals(arrayRealVector8));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector0 = new org.apache.commons.math.linear.ArrayRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = openMapRealVector1.append(openMapRealVector2);
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector2.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector5.append(openMapRealVector6);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = openMapRealVector2.add(openMapRealVector6);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector9.append(openMapRealVector10);
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector9.mapTan();
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.mapRintToSelf();
        double double14 = openMapRealVector9.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector9, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector2.append((org.apache.commons.math.linear.RealVector) openMapRealVector9);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator18 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry19 = openMapRealVector9.new OpenMapEntry(iterator18);
        double double20 = arrayRealVector0.getL1Distance((org.apache.commons.math.linear.RealVector) openMapRealVector9);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector0 and openMapRealVector1.", arrayRealVector0.equals(openMapRealVector1) == openMapRealVector1.equals(arrayRealVector0));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog1pToSelf();
        arrayRealVector16.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = arrayRealVector16.subtract(arrayRealVector21);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector21.projection(realVector26);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector21.mapCoshToSelf();
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray29, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog1pToSelf();
        arrayRealVector33.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector33.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector31, arrayRealVector33);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = arrayRealVector21.ebeDivide(arrayRealVector38);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapLog1pToSelf();
        arrayRealVector41.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector46.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = arrayRealVector41.subtract(arrayRealVector46);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector50.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector46.projection(realVector51);
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector46.mapSubtract((double) 100L);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector46.mapCosh();
        double double56 = arrayRealVector39.getL1Distance((org.apache.commons.math.linear.RealVector) arrayRealVector46);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector57 = arrayRealVector10.ebeMultiply(arrayRealVector46);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector14.", arrayRealVector10.equals(openMapRealVector14) == openMapRealVector14.equals(arrayRealVector10));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 2.53E-321d, 1.0E-12d, Double.NaN, 100.0d };
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector5 and openMapRealVector6.", arrayRealVector5.equals(openMapRealVector6) == openMapRealVector6.equals(arrayRealVector5));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog1pToSelf();
        arrayRealVector7.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5, arrayRealVector7);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, (org.apache.commons.math.linear.RealVector) arrayRealVector12);
        java.lang.Double[] doubleArray19 = new java.lang.Double[] { 2.53E-321d, 1.0E-12d, Double.NaN, 100.0d };
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19);
        boolean boolean22 = arrayRealVector1.equals((java.lang.Object) doubleArray19);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector20 and openMapRealVector21.", arrayRealVector20.equals(openMapRealVector21) == openMapRealVector21.equals(arrayRealVector20));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector10);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector10.mapSubtractToSelf((double) (-1.0f));
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector10.mapAbsToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector10.append(3.1622776601683794E-12d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapLog1pToSelf();
        arrayRealVector21.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = arrayRealVector21.subtract(arrayRealVector26);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector26.mapLogToSelf();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector26.mapSqrt();
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector26.mapTanToSelf();
        arrayRealVector10.checkVectorDimensions(realVector31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector14 and arrayRealVector21.", openMapRealVector14.equals(arrayRealVector21) == arrayRealVector21.equals(openMapRealVector14));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapLog1pToSelf();
        arrayRealVector5.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector5.subtract(arrayRealVector10);
        double[] doubleArray19 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector10.data = doubleArray19;
        double[] doubleArray21 = arrayRealVector10.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector2.append(doubleArray21);
        double double23 = openMapRealVector22.getLInfNorm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector22.", arrayRealVector10.equals(openMapRealVector22) == openMapRealVector22.equals(arrayRealVector10));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor3 = openMapRealVector0.iterator();
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector0.mapSinToSelf();
        double double5 = openMapRealVector0.getSparcity();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog1pToSelf();
        arrayRealVector7.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = arrayRealVector7.subtract(arrayRealVector12);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector7.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector7.checkVectorDimensions((int) (byte) 10);
        double[] doubleArray19 = arrayRealVector7.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector0.append(doubleArray19);
        boolean boolean22 = openMapRealVector0.isDefaultValue((double) (short) 100);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector7 and openMapRealVector20.", arrayRealVector7.equals(openMapRealVector20) == openMapRealVector20.equals(arrayRealVector7));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        double[] doubleArray15 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector6.data = doubleArray15;
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector6.mapAbsToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapLog1pToSelf();
        arrayRealVector19.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = arrayRealVector19.subtract(arrayRealVector24);
        double[] doubleArray33 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector24.data = doubleArray33;
        double[] doubleArray35 = arrayRealVector24.toArray();
        double double36 = arrayRealVector6.getDistance(doubleArray35);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray35, true);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray35);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapLog1pToSelf();
        double[] doubleArray43 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray43, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector47.mapLog1pToSelf();
        arrayRealVector47.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector47.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector45, arrayRealVector47);
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector52.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector41, (org.apache.commons.math.linear.RealVector) arrayRealVector52);
        double[] doubleArray55 = arrayRealVector41.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray35, doubleArray55);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector6 and openMapRealVector39.", arrayRealVector6.equals(openMapRealVector39) == openMapRealVector39.equals(arrayRealVector6));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.append(openMapRealVector9);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector8.mapTan();
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector8.mapRintToSelf();
        double double13 = openMapRealVector8.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector8, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector1.append((org.apache.commons.math.linear.RealVector) openMapRealVector8);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator17 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry18 = openMapRealVector8.new OpenMapEntry(iterator17);
        boolean boolean20 = openMapRealVector8.isDefaultValue((double) ' ');
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector8.mapAtan();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector23.mapSinToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector8.append((org.apache.commons.math.linear.RealVector) arrayRealVector23);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector27.append(openMapRealVector28);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector27.mapTan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector27.copy();
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector31.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector31.append(Double.NaN);
        double double35 = openMapRealVector26.getDistance(openMapRealVector34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector23 and openMapRealVector26.", arrayRealVector23.equals(openMapRealVector26) == openMapRealVector26.equals(arrayRealVector23));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector1.mapMultiplyToSelf((double) (short) 10);
        double[] doubleArray11 = arrayRealVector1.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray11, 3.1622776601683794E-12d);
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector13.mapLog();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector13.", arrayRealVector1.equals(openMapRealVector13) == openMapRealVector13.equals(arrayRealVector1));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapLog1pToSelf();
        arrayRealVector5.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector5.subtract(arrayRealVector10);
        double[] doubleArray19 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector10.data = doubleArray19;
        double[] doubleArray21 = arrayRealVector10.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector2.append(doubleArray21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector22, 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector22.", arrayRealVector10.equals(openMapRealVector22) == openMapRealVector22.equals(arrayRealVector10));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = openMapRealVector0.mapAdd(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector0, (int) (byte) 1);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector0.mapPow((double) (short) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        arrayRealVector8.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = arrayRealVector8.subtract(arrayRealVector13);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector13.projection(realVector18);
        double[] doubleArray20 = arrayRealVector13.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector0.append(doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector22.append(openMapRealVector23);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector23.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double27 = openMapRealVector23.dotProduct(openMapRealVector26);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector26.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector26.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.mapRint();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector0.subtract(openMapRealVector26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector8 and openMapRealVector21.", arrayRealVector8.equals(openMapRealVector21) == openMapRealVector21.equals(arrayRealVector8));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector3.append(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector3.mapTan();
        double double7 = openMapRealVector1.getL1Distance(openMapRealVector3);
        double double8 = openMapRealVector3.getNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray11 = arrayRealVector10.getDataRef();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapLog1p();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapLog1pToSelf();
        arrayRealVector14.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = arrayRealVector14.subtract(arrayRealVector19);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector19.projection(realVector24);
        double[] doubleArray26 = arrayRealVector19.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100);
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector28.mapTanhToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector19, (org.apache.commons.math.linear.RealVector) openMapRealVector28);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector10.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector3.append(realVector31);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector34.mapLog1pToSelf();
        arrayRealVector34.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector39.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = arrayRealVector34.subtract(arrayRealVector39);
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector34.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector34.checkVectorDimensions((int) (byte) 10);
        double[] doubleArray46 = arrayRealVector34.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector48.mapLog1pToSelf();
        arrayRealVector48.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector53 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector53.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = arrayRealVector48.subtract(arrayRealVector53);
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector48.mapMultiplyToSelf((double) (short) 10);
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector48.mapLog();
        double double59 = arrayRealVector34.getLInfDistance((org.apache.commons.math.linear.RealVector) arrayRealVector48);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector3.append((org.apache.commons.math.linear.RealVector) arrayRealVector48);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector32.", arrayRealVector10.equals(openMapRealVector32) == openMapRealVector32.equals(arrayRealVector10));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector10);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector10.mapSubtractToSelf((double) (-1.0f));
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapLog1pToSelf();
        arrayRealVector18.set(0.0d);
        double double22 = arrayRealVector18.getL1Norm();
        double double23 = arrayRealVector10.getDistance(arrayRealVector18);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector14 and arrayRealVector18.", openMapRealVector14.equals(arrayRealVector18) == arrayRealVector18.equals(openMapRealVector14));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.append(openMapRealVector9);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector8.mapTan();
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector8.mapRintToSelf();
        double double13 = openMapRealVector8.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector8, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector1.append((org.apache.commons.math.linear.RealVector) openMapRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapLog1pToSelf();
        arrayRealVector18.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = arrayRealVector18.subtract(arrayRealVector23);
        double[] doubleArray32 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector23.data = doubleArray32;
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector23.mapAbsToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector36.mapLog1pToSelf();
        arrayRealVector36.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = arrayRealVector36.subtract(arrayRealVector41);
        double[] doubleArray50 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector41.data = doubleArray50;
        double[] doubleArray52 = arrayRealVector41.toArray();
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector23.subtract(doubleArray52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray52, true);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector1.append(doubleArray52);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector56.mapLog1p();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector23 and openMapRealVector56.", arrayRealVector23.equals(openMapRealVector56) == openMapRealVector56.equals(arrayRealVector23));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2, arrayRealVector4);
        boolean boolean10 = arrayRealVector4.isNaN();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector4.mapMultiplyToSelf((double) 0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapLog1pToSelf();
        arrayRealVector14.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector14.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector14.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector22.mapLog1pToSelf();
        arrayRealVector22.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = arrayRealVector22.subtract(arrayRealVector27);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector31.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector27.projection(realVector32);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector27.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = arrayRealVector14.projection(arrayRealVector27);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapSin();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor37 = arrayRealVector35.iterator();
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector35.mapRint();
        arrayRealVector4.checkVectorDimensions((org.apache.commons.math.linear.RealVector) arrayRealVector35);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapLog1pToSelf();
        arrayRealVector41.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector46.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = arrayRealVector41.subtract(arrayRealVector46);
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector41.mapMultiplyToSelf((double) (short) 10);
        double[] doubleArray51 = arrayRealVector41.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray51, 3.1622776601683794E-12d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector35, doubleArray51);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector4 and openMapRealVector53.", arrayRealVector4.equals(openMapRealVector53) == openMapRealVector53.equals(arrayRealVector4));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector5.append((double) 0.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector5.mapSinToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and arrayRealVector10.", openMapRealVector0.equals(arrayRealVector10) == arrayRealVector10.equals(openMapRealVector0));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector4.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapLog1pToSelf();
        arrayRealVector12.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = arrayRealVector12.subtract(arrayRealVector17);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector17.projection(realVector22);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector17.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = arrayRealVector4.projection(arrayRealVector17);
        double[] doubleArray26 = arrayRealVector17.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector27.append(openMapRealVector28);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector27.mapTan();
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog1pToSelf();
        arrayRealVector33.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector33.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector33.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector33.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector27, arrayRealVector33);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapSqrt();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26, arrayRealVector41);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector0.append(doubleArray26);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector0.mapSignumToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector17 and openMapRealVector44.", arrayRealVector17.equals(openMapRealVector44) == openMapRealVector44.equals(arrayRealVector17));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.append(openMapRealVector9);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector8.mapTan();
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector8.mapRintToSelf();
        double double13 = openMapRealVector8.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector8, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector1.append((org.apache.commons.math.linear.RealVector) openMapRealVector8);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator17 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry18 = openMapRealVector8.new OpenMapEntry(iterator17);
        boolean boolean20 = openMapRealVector8.isDefaultValue((double) ' ');
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector8.mapAtan();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector23.mapSinToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector8.append((org.apache.commons.math.linear.RealVector) arrayRealVector23);
        double double27 = arrayRealVector23.getLInfNorm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector23 and openMapRealVector26.", arrayRealVector23.equals(openMapRealVector26) == openMapRealVector26.equals(arrayRealVector23));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        double[] doubleArray15 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector6.data = doubleArray15;
        double[] doubleArray17 = arrayRealVector6.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapLog1pToSelf();
        arrayRealVector19.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = arrayRealVector19.subtract(arrayRealVector24);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector19.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector19.checkVectorDimensions((int) (byte) 10);
        double[] doubleArray31 = arrayRealVector19.toArray();
        double double33 = arrayRealVector19.getEntry((int) (short) 0);
        double[] doubleArray34 = arrayRealVector19.getDataRef();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector19.mapPowToSelf(10.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray17, arrayRealVector19);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector39.mapLog1pToSelf();
        arrayRealVector39.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector44 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector44.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = arrayRealVector39.subtract(arrayRealVector44);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector39.mapMultiplyToSelf((double) (short) 10);
        double[] doubleArray49 = arrayRealVector39.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray49, 3.1622776601683794E-12d);
        arrayRealVector37.data = doubleArray49;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector51.", arrayRealVector1.equals(openMapRealVector51) == openMapRealVector51.equals(arrayRealVector1));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        boolean boolean9 = openMapRealVector7.isDefaultValue((double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector7.mapAddToSelf(Double.NaN);
        openMapRealVector11.set((double) 100.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector14.append(openMapRealVector15);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector14.mapTan();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector14.mapExpm1ToSelf();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray20, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector14.projection(doubleArray20);
        double[] doubleArray27 = new double[] { 10, (-1.0d), (short) 0 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector23.append(doubleArray27);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector11.add(doubleArray27);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor31 = openMapRealVector11.iterator();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector28 and realVector30.", openMapRealVector28.equals(realVector30) == realVector30.equals(openMapRealVector28));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector3.append(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector3.mapTan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector3.copy();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector7.mapCeilToSelf();
        double double9 = openMapRealVector2.getL1Distance(openMapRealVector7);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        arrayRealVector11.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = arrayRealVector11.subtract(arrayRealVector16);
        double[] doubleArray25 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector16.data = doubleArray25;
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector16.mapAbsToSelf();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector16.mapLog1pToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector29.append(openMapRealVector30);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector29.mapTan();
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector29.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapLog1pToSelf();
        arrayRealVector35.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector35.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector35.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector35.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector29, arrayRealVector35);
        double[] doubleArray44 = arrayRealVector35.toArray();
        boolean boolean45 = arrayRealVector16.equals((java.lang.Object) doubleArray44);
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector16.mapSinToSelf();
        double[] doubleArray47 = arrayRealVector16.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector2.append(doubleArray47);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector2.mapMultiply((double) (byte) 1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector16 and openMapRealVector48.", arrayRealVector16.equals(openMapRealVector48) == openMapRealVector48.equals(arrayRealVector16));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector6.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        arrayRealVector11.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = arrayRealVector11.subtract(arrayRealVector16);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector11.mapMultiplyToSelf((double) (short) 10);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector6.projection(realVector20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapLog1pToSelf();
        arrayRealVector25.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector30.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = arrayRealVector25.subtract(arrayRealVector30);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector30.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = arrayRealVector23.append(arrayRealVector30);
        double[] doubleArray35 = arrayRealVector34.getData();
        double double36 = arrayRealVector34.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector6, (org.apache.commons.math.linear.RealVector) arrayRealVector34);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector38.append(openMapRealVector39);
        org.apache.commons.math.linear.RealVector realVector41 = openMapRealVector38.mapTan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector42.append(openMapRealVector43);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector43.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector46.append(openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector43.add(openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector50.append(openMapRealVector51);
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector50.mapTan();
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector50.mapRintToSelf();
        double double55 = openMapRealVector50.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector50, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector43.append((org.apache.commons.math.linear.RealVector) openMapRealVector50);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator59 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry60 = openMapRealVector50.new OpenMapEntry(iterator59);
        boolean boolean62 = openMapRealVector50.isDefaultValue((double) ' ');
        org.apache.commons.math.linear.RealVector realVector63 = openMapRealVector50.mapAtan();
        double[] doubleArray64 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray64, 0.0d);
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector66.mapUlpToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector50.add(openMapRealVector66);
        double[] doubleArray69 = openMapRealVector68.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector38.ebeDivide(doubleArray69);
        double[] doubleArray74 = new double[] { 10, (-1.0d), (short) 0 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector75 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray74);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector76 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray69, doubleArray74);
        arrayRealVector6.data = doubleArray74;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector6 and openMapRealVector75.", arrayRealVector6.equals(openMapRealVector75) == openMapRealVector75.equals(arrayRealVector6));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector1.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapLog1pToSelf();
        arrayRealVector9.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = arrayRealVector9.subtract(arrayRealVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector14.projection(realVector19);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector14.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = arrayRealVector1.projection(arrayRealVector14);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector22.mapSin();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor24 = arrayRealVector22.iterator();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector22.mapAbsToSelf();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector22.mapExpToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector22);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector22.mapExpToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector14 and openMapRealVector27.", arrayRealVector14.equals(openMapRealVector27) == openMapRealVector27.equals(arrayRealVector14));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.append(openMapRealVector9);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector8.mapTan();
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector8.mapRintToSelf();
        double double13 = openMapRealVector8.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector8, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector1.append((org.apache.commons.math.linear.RealVector) openMapRealVector8);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator17 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry18 = openMapRealVector8.new OpenMapEntry(iterator17);
        boolean boolean20 = openMapRealVector8.isDefaultValue((double) ' ');
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector8.mapAtan();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector23.mapSinToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector8.append((org.apache.commons.math.linear.RealVector) arrayRealVector23);
        double double27 = openMapRealVector8.getLInfNorm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector23 and openMapRealVector26.", arrayRealVector23.equals(openMapRealVector26) == openMapRealVector26.equals(arrayRealVector23));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, (-1.0d), (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4, (double) 0.0f);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector5 and arrayRealVector6.", openMapRealVector5.equals(arrayRealVector6) == arrayRealVector6.equals(openMapRealVector5));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, (-1.0d), (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector5 and arrayRealVector6.", openMapRealVector5.equals(arrayRealVector6) == arrayRealVector6.equals(openMapRealVector5));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapUlpToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapAdd(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray10, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapLog1pToSelf();
        arrayRealVector14.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector14.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector12, arrayRealVector14);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector8, (org.apache.commons.math.linear.RealVector) arrayRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector23.append(openMapRealVector24);
        org.apache.commons.math.linear.RealVector realVector26 = openMapRealVector24.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector27.append(openMapRealVector28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector24.add(openMapRealVector28);
        arrayRealVector19.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector4.append(openMapRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector2.add(openMapRealVector32);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector32.mapPow((double) 100.0f);
        boolean boolean36 = openMapRealVector32.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector32);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector39.mapLog1pToSelf();
        arrayRealVector39.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector39.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector39.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector47.mapLog1pToSelf();
        arrayRealVector47.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector52.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = arrayRealVector47.subtract(arrayRealVector52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector56.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector52.projection(realVector57);
        org.apache.commons.math.linear.RealVector realVector59 = arrayRealVector52.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector60 = arrayRealVector39.projection(arrayRealVector52);
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector60.mapSin();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor62 = arrayRealVector60.iterator();
        org.apache.commons.math.linear.RealVector realVector63 = arrayRealVector60.mapAbsToSelf();
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector60.mapExpToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector60);
        double double66 = openMapRealVector32.getDistance(openMapRealVector65);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector52 and openMapRealVector65.", arrayRealVector52.equals(openMapRealVector65) == openMapRealVector65.equals(arrayRealVector52));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector0.mapTan();
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector0.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        arrayRealVector6.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector6.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector6.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector6.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector0, arrayRealVector6);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapSqrt();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector14.mapSinhToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector14.mapAdd(3.1622776601683795d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapLog1pToSelf();
        arrayRealVector20.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector20.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector20.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector28.mapLog1pToSelf();
        arrayRealVector28.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = arrayRealVector28.subtract(arrayRealVector33);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector37.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector33.projection(realVector38);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector33.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = arrayRealVector20.projection(arrayRealVector33);
        double[] doubleArray42 = arrayRealVector33.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector43.append(openMapRealVector44);
        org.apache.commons.math.linear.RealVector realVector46 = openMapRealVector43.mapTan();
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector43.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector49.mapLog1pToSelf();
        arrayRealVector49.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector49.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector49.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector49.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector57 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector43, arrayRealVector49);
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector57.mapSqrt();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector59 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray42, arrayRealVector57);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray42);
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector14.add(doubleArray42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector33 and openMapRealVector60.", arrayRealVector33.equals(openMapRealVector60) == openMapRealVector60.equals(arrayRealVector33));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog1pToSelf();
        arrayRealVector7.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5, arrayRealVector7);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, (org.apache.commons.math.linear.RealVector) arrayRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector16.append(openMapRealVector17);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector17.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector20.append(openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector17.add(openMapRealVector21);
        arrayRealVector12.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector12.mapUlpToSelf();
        double double26 = arrayRealVector12.getLInfNorm();
        double[] doubleArray27 = arrayRealVector12.getData();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector12.mapInvToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector30.mapLog1pToSelf();
        arrayRealVector30.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = arrayRealVector30.subtract(arrayRealVector35);
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector30.mapMultiplyToSelf((double) (short) 10);
        double[] doubleArray40 = arrayRealVector30.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray40, 3.1622776601683794E-12d);
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector12.projection(doubleArray40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector42.", arrayRealVector1.equals(openMapRealVector42) == openMapRealVector42.equals(arrayRealVector1));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray2 = arrayRealVector1.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector3.mapAsin();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector3.", arrayRealVector1.equals(openMapRealVector3) == openMapRealVector3.equals(arrayRealVector1));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 10.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray1, 1.0d);
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector3.mapAtanToSelf();
        int int5 = openMapRealVector3.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector3);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector6);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.RealVector realVector10 = openMapRealVector8.mapAdd(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector8, (int) (byte) 1);
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector8.mapPow((double) (short) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog1pToSelf();
        arrayRealVector16.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = arrayRealVector16.subtract(arrayRealVector21);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector21.projection(realVector26);
        double[] doubleArray28 = arrayRealVector21.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector8.append(doubleArray28);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector7.append(doubleArray28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector16 and openMapRealVector29.", arrayRealVector16.equals(openMapRealVector29) == openMapRealVector29.equals(arrayRealVector16));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector1.mapSubtract((double) (byte) 100);
        int int8 = arrayRealVector1.getDimension();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector9.append(openMapRealVector10);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor12 = openMapRealVector9.iterator();
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector9.mapSinToSelf();
        double double14 = openMapRealVector9.getSparcity();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog1pToSelf();
        arrayRealVector16.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = arrayRealVector16.subtract(arrayRealVector21);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector16.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector16.checkVectorDimensions((int) (byte) 10);
        double[] doubleArray28 = arrayRealVector16.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector9.append(doubleArray28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, doubleArray28);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector29.", arrayRealVector1.equals(openMapRealVector29) == openMapRealVector29.equals(arrayRealVector1));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 2.53E-321d, 1.0E-12d, Double.NaN, 100.0d };
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector5 and openMapRealVector7.", arrayRealVector5.equals(openMapRealVector7) == openMapRealVector7.equals(arrayRealVector5));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector6.projection(realVector11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector6.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog1pToSelf();
        arrayRealVector15.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector15.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector15.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        arrayRealVector23.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector28.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = arrayRealVector23.subtract(arrayRealVector28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector32.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector28.projection(realVector33);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector28.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = arrayRealVector15.projection(arrayRealVector28);
        double[] doubleArray37 = arrayRealVector28.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray37);
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector6.ebeDivide(doubleArray37);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector6 and openMapRealVector38.", arrayRealVector6.equals(openMapRealVector38) == openMapRealVector38.equals(arrayRealVector6));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector0.mapTan();
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector0.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        arrayRealVector6.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector6.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector6.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector6.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector0, arrayRealVector6);
        double[] doubleArray15 = arrayRealVector6.toArray();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector6.mapPow((double) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(realVector17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector18.copy();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector17 and openMapRealVector18.", realVector17.equals(openMapRealVector18) == openMapRealVector18.equals(realVector17));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector6.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        arrayRealVector11.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = arrayRealVector11.subtract(arrayRealVector16);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector11.mapMultiplyToSelf((double) (short) 10);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector6.projection(realVector20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapLog1pToSelf();
        arrayRealVector25.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector30.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = arrayRealVector25.subtract(arrayRealVector30);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector30.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = arrayRealVector23.append(arrayRealVector30);
        double[] doubleArray35 = arrayRealVector34.getData();
        double double36 = arrayRealVector34.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector6, (org.apache.commons.math.linear.RealVector) arrayRealVector34);
        double[] doubleArray38 = arrayRealVector6.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray38);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapLog1pToSelf();
        arrayRealVector41.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector46.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = arrayRealVector41.subtract(arrayRealVector46);
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector41.mapMultiplyToSelf((double) (short) 10);
        double[] doubleArray51 = arrayRealVector41.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray51, 0, (int) (byte) 10);
        double double55 = openMapRealVector39.getLInfDistance(doubleArray51);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector6 and openMapRealVector39.", arrayRealVector6.equals(openMapRealVector39) == openMapRealVector39.equals(arrayRealVector6));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2, arrayRealVector4);
        boolean boolean10 = arrayRealVector4.isNaN();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector4.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector4.mapTanToSelf();
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector4.mapCosToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(10, 1, (double) 1L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector17.mapAdd((double) (short) -1);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector4.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector9 and openMapRealVector17.", arrayRealVector9.equals(openMapRealVector17) == openMapRealVector17.equals(arrayRealVector9));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray1, 0.0d);
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector3.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        arrayRealVector6.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = arrayRealVector6.subtract(arrayRealVector11);
        double[] doubleArray20 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector11.data = doubleArray20;
        double[] doubleArray22 = arrayRealVector11.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector3.append(doubleArray22);
        double double24 = openMapRealVector0.getL1Distance(openMapRealVector23);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector11 and openMapRealVector23.", arrayRealVector11.equals(openMapRealVector23) == openMapRealVector23.equals(arrayRealVector11));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector0.mapTan();
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector0.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        arrayRealVector6.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector6.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector6.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector6.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector0, arrayRealVector6);
        double[] doubleArray15 = arrayRealVector6.toArray();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector6.mapPow((double) (short) 100);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(realVector17);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector18.mapSubtract((-0.0d));
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector17 and openMapRealVector18.", realVector17.equals(openMapRealVector18) == openMapRealVector18.equals(realVector17));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapTanhToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector5.", openMapRealVector2.equals(realVector5) == realVector5.equals(openMapRealVector2));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        boolean boolean9 = openMapRealVector7.isDefaultValue((double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector7.mapAddToSelf(Double.NaN);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector12.append(openMapRealVector13);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor15 = openMapRealVector12.iterator();
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.mapSinToSelf();
        double double17 = openMapRealVector12.getSparcity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector18.append(openMapRealVector19);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector19.mapExp();
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector19.mapRint();
        boolean boolean23 = openMapRealVector12.equals((java.lang.Object) realVector22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector12.mapAddToSelf((double) '4');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector25.mapAdd((double) 100);
        double double28 = openMapRealVector11.dotProduct(openMapRealVector25);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector30.mapLog1pToSelf();
        arrayRealVector30.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector30.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector30.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector38.mapLog1pToSelf();
        arrayRealVector38.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector43.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = arrayRealVector38.subtract(arrayRealVector43);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector47.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector43.projection(realVector48);
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector43.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector51 = arrayRealVector30.projection(arrayRealVector43);
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector51.mapSin();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor53 = arrayRealVector51.iterator();
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector51.mapAbsToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector56.mapLog1pToSelf();
        arrayRealVector56.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector61.mapLog1pToSelf();
        arrayRealVector61.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector66 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector67 = arrayRealVector66.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector68 = arrayRealVector61.subtract(arrayRealVector66);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector69 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector56, arrayRealVector66);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100);
        org.apache.commons.math.linear.RealVector realVector72 = openMapRealVector71.mapTanhToSelf();
        boolean boolean73 = arrayRealVector56.equals((java.lang.Object) realVector72);
        double[] doubleArray74 = arrayRealVector56.data;
        org.apache.commons.math.linear.RealVector realVector75 = arrayRealVector51.add(doubleArray74);
        double[] doubleArray76 = arrayRealVector51.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector79 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray76, (int) (short) 10, (int) (byte) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = openMapRealVector25.append(doubleArray76);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and arrayRealVector79.", openMapRealVector0.equals(arrayRealVector79) == arrayRealVector79.equals(openMapRealVector0));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator5 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry6 = openMapRealVector2.new OpenMapEntry(iterator5);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and arrayRealVector4.", openMapRealVector2.equals(arrayRealVector4) == arrayRealVector4.equals(openMapRealVector2));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapDivideToSelf((double) (short) -1);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = arrayRealVector10.subtract(arrayRealVector15);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector15.mapDivideToSelf(Double.NaN);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector15.mapAbs();
        double double21 = arrayRealVector15.getL1Norm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector15);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapLog1pToSelf();
        arrayRealVector24.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector29.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = arrayRealVector24.subtract(arrayRealVector29);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector29.mapLogToSelf();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector29.mapSqrt();
        double[] doubleArray34 = arrayRealVector29.data;
        double double35 = arrayRealVector15.getL1Distance(doubleArray34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector15 and openMapRealVector22.", arrayRealVector15.equals(openMapRealVector22) == openMapRealVector22.equals(arrayRealVector15));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 2.53E-321d, 1.0E-12d, Double.NaN, 100.0d };
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4, 4.9E-323d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4, 4.9E-323d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector5 and openMapRealVector8.", arrayRealVector5.equals(openMapRealVector8) == openMapRealVector8.equals(arrayRealVector5));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2, arrayRealVector4);
        boolean boolean10 = arrayRealVector4.isNaN();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector4.mapMultiplyToSelf((double) 0);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapLog1pToSelf();
        arrayRealVector14.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector14.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector14.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector22.mapLog1pToSelf();
        arrayRealVector22.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = arrayRealVector22.subtract(arrayRealVector27);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector31.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector27.projection(realVector32);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector27.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = arrayRealVector14.projection(arrayRealVector27);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapSin();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor37 = arrayRealVector35.iterator();
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector35.mapRint();
        arrayRealVector4.checkVectorDimensions((org.apache.commons.math.linear.RealVector) arrayRealVector35);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector4.mapSinhToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector41.append(openMapRealVector42);
        org.apache.commons.math.linear.RealVector realVector44 = openMapRealVector42.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double46 = openMapRealVector42.dotProduct(openMapRealVector45);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector45.mapInvToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector49.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector49.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector49.mapAcosToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector45.append((org.apache.commons.math.linear.RealVector) arrayRealVector49);
        double double54 = arrayRealVector4.dotProduct(arrayRealVector49);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector49 and openMapRealVector53.", arrayRealVector49.equals(openMapRealVector53) == openMapRealVector53.equals(arrayRealVector49));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog10ToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector5.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.append(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector5.add(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector9.append((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector14.append(openMapRealVector15);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector14.mapTan();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector14.mapExpm1ToSelf();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray20, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector14.projection(doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector9.subtract(doubleArray20);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector24.mapTanhToSelf();
        arrayRealVector1.setSubVector((int) ' ', realVector25);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector4.", arrayRealVector1.equals(openMapRealVector4) == openMapRealVector4.equals(arrayRealVector1));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector4.mapAcos();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapLog1pToSelf();
        arrayRealVector13.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = arrayRealVector13.subtract(arrayRealVector18);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector18.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = arrayRealVector11.append(arrayRealVector18);
        java.lang.String str23 = arrayRealVector22.toString();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector22.mapSubtractToSelf((double) '#');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector4.append(realVector25);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector28.mapLog1pToSelf();
        arrayRealVector28.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = arrayRealVector28.subtract(arrayRealVector33);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector28.mapMultiplyToSelf((double) (short) 10);
        double[] doubleArray38 = arrayRealVector28.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector40.mapLog1pToSelf();
        arrayRealVector40.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector40.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector40.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector48.mapLog1pToSelf();
        arrayRealVector48.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector53 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector53.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = arrayRealVector48.subtract(arrayRealVector53);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector57 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector57.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector59 = arrayRealVector53.projection(realVector58);
        org.apache.commons.math.linear.RealVector realVector60 = arrayRealVector53.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = arrayRealVector40.projection(arrayRealVector53);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector40.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector64 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector40, false);
        org.apache.commons.math.linear.RealVector realVector65 = arrayRealVector40.mapLogToSelf();
        org.apache.commons.math.linear.RealVector realVector66 = arrayRealVector40.mapFloorToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector67 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray38, arrayRealVector40);
        org.apache.commons.math.linear.RealMatrix realMatrix68 = openMapRealVector26.outerProduct((org.apache.commons.math.linear.RealVector) arrayRealVector67);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector22 and openMapRealVector26.", arrayRealVector22.equals(openMapRealVector26) == openMapRealVector26.equals(arrayRealVector22));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 2.53E-321d, 1.0E-12d, Double.NaN, 100.0d };
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4, 4.9E-323d);
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector8.mapRint();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector5 and openMapRealVector8.", arrayRealVector5.equals(openMapRealVector8) == openMapRealVector8.equals(arrayRealVector5));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapAcosToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector8);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector4.mapCoshToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector8 and openMapRealVector12.", arrayRealVector8.equals(openMapRealVector12) == openMapRealVector12.equals(arrayRealVector8));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector4.mapAcos();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapLog1pToSelf();
        arrayRealVector13.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = arrayRealVector13.subtract(arrayRealVector18);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector18.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = arrayRealVector11.append(arrayRealVector18);
        java.lang.String str23 = arrayRealVector22.toString();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector22.mapSubtractToSelf((double) '#');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector4.append(realVector25);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector26.mapSqrt();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector22 and openMapRealVector26.", arrayRealVector22.equals(openMapRealVector26) == openMapRealVector26.equals(arrayRealVector22));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2, arrayRealVector4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector2.mapAdd(Double.NaN);
        double double12 = openMapRealVector2.getLInfNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector13.append(openMapRealVector14);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor16 = openMapRealVector13.iterator();
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector13.mapSinToSelf();
        double double18 = openMapRealVector13.getSparcity();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapLog1pToSelf();
        arrayRealVector20.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = arrayRealVector20.subtract(arrayRealVector25);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector20.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector20.checkVectorDimensions((int) (byte) 10);
        double[] doubleArray32 = arrayRealVector20.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector13.append(doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector2.add(doubleArray32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector4 and openMapRealVector33.", arrayRealVector4.equals(openMapRealVector33) == openMapRealVector33.equals(arrayRealVector4));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector6.mapLogToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector6.mapSqrt();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray14 = arrayRealVector13.getDataRef();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector13.mapCosToSelf();
        double[] doubleArray16 = arrayRealVector13.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray16, false);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray16);
        arrayRealVector6.data = doubleArray16;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector6 and openMapRealVector19.", arrayRealVector6.equals(openMapRealVector19) == openMapRealVector19.equals(arrayRealVector6));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog1pToSelf();
        arrayRealVector7.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5, arrayRealVector7);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, (org.apache.commons.math.linear.RealVector) arrayRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector16.append(openMapRealVector17);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector17.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector20.append(openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector17.add(openMapRealVector21);
        arrayRealVector12.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector12.mapUlpToSelf();
        double double26 = arrayRealVector12.getLInfNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector28.mapLog1pToSelf();
        arrayRealVector28.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = arrayRealVector28.subtract(arrayRealVector33);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector28.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector28.checkVectorDimensions((int) (byte) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector42.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector42.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector42.mapAcosToSelf();
        double double46 = arrayRealVector28.getDistance(arrayRealVector42);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor47 = arrayRealVector28.iterator();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = arrayRealVector12.append(arrayRealVector28);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector28.mapCbrtToSelf();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector28.mapAcosToSelf();
        boolean boolean51 = arrayRealVector28.isInfinite();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector54.mapLog1pToSelf();
        arrayRealVector54.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector59 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector60 = arrayRealVector59.mapLog1pToSelf();
        arrayRealVector59.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector64 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector65 = arrayRealVector64.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector66 = arrayRealVector59.subtract(arrayRealVector64);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector67 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector54, arrayRealVector64);
        org.apache.commons.math.linear.RealVector realVector68 = arrayRealVector54.mapCos();
        org.apache.commons.math.linear.RealVector realVector69 = arrayRealVector54.mapUlp();
        org.apache.commons.math.linear.RealVector realVector71 = arrayRealVector54.mapAddToSelf((double) 1L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector72.append(openMapRealVector73);
        double[] doubleArray75 = openMapRealVector73.toArray();
        org.apache.commons.math.linear.RealVector realVector76 = arrayRealVector54.append(doubleArray75);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = openMapRealVector77.append(openMapRealVector78);
        org.apache.commons.math.linear.RealVector realVector80 = openMapRealVector78.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector83 = openMapRealVector81.append(openMapRealVector82);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = openMapRealVector78.add(openMapRealVector82);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector82.append((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector87 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector88 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector89 = openMapRealVector87.append(openMapRealVector88);
        org.apache.commons.math.linear.RealVector realVector90 = openMapRealVector87.mapTan();
        org.apache.commons.math.linear.RealVector realVector91 = openMapRealVector87.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector92 = openMapRealVector87.mapExpm1ToSelf();
        double[] doubleArray93 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector95 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray93, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector96 = openMapRealVector87.projection(doubleArray93);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector97 = openMapRealVector82.subtract(doubleArray93);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector98 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray75, doubleArray93);
        arrayRealVector28.setSubVector((int) (byte) 1, doubleArray75);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector5 and arrayRealVector98.", openMapRealVector5.equals(arrayRealVector98) == arrayRealVector98.equals(openMapRealVector5));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector1.mapMultiplyToSelf((double) (short) 10);
        double[] doubleArray11 = arrayRealVector1.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray11, 3.1622776601683794E-12d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray11, false);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector13.", arrayRealVector1.equals(openMapRealVector13) == openMapRealVector13.equals(arrayRealVector1));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector6.projection(realVector11);
        double[] doubleArray13 = arrayRealVector6.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog1pToSelf();
        arrayRealVector15.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = arrayRealVector15.subtract(arrayRealVector20);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector15.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector15.checkVectorDimensions((int) (byte) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector15);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector29.mapLog1pToSelf();
        arrayRealVector29.set(0.0d);
        double double33 = arrayRealVector29.getL1Norm();
        org.apache.commons.math.linear.RealMatrix realMatrix34 = arrayRealVector15.outerProduct(arrayRealVector29);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = arrayRealVector6.ebeDivide(arrayRealVector15);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector37.mapLog1pToSelf();
        arrayRealVector37.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector37.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector37.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector37.mapTanh();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector37.mapCbrt();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector15, arrayRealVector37);
        org.apache.commons.math.linear.AbstractRealVector abstractRealVector47 = arrayRealVector15.copy();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector49.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector49.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector49.mapAcosToSelf();
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector49.mapExpm1ToSelf();
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector49.mapCosToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = arrayRealVector15.subtract(arrayRealVector49);
        java.lang.Double[] doubleArray60 = new java.lang.Double[] { 2.53E-321d, 1.0E-12d, Double.NaN, 100.0d };
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray60);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector62 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray60);
        org.apache.commons.math.linear.RealVector realVector63 = arrayRealVector62.mapLogToSelf();
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector62.mapCeilToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector66 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector67 = arrayRealVector66.mapLog1pToSelf();
        double[] doubleArray68 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray68, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector72 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector73 = arrayRealVector72.mapLog1pToSelf();
        arrayRealVector72.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector76 = arrayRealVector72.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector77 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector70, arrayRealVector72);
        org.apache.commons.math.linear.RealVector realVector78 = arrayRealVector77.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector79 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector66, (org.apache.commons.math.linear.RealVector) arrayRealVector77);
        double[] doubleArray80 = arrayRealVector66.getData();
        org.apache.commons.math.linear.RealVector realVector81 = arrayRealVector62.append(doubleArray80);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray80);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector83 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector49, doubleArray80);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector82.", arrayRealVector1.equals(openMapRealVector82) == openMapRealVector82.equals(arrayRealVector1));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector4.mapAcos();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapLog1pToSelf();
        arrayRealVector13.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = arrayRealVector13.subtract(arrayRealVector18);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector18.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = arrayRealVector11.append(arrayRealVector18);
        java.lang.String str23 = arrayRealVector22.toString();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector22.mapSubtractToSelf((double) '#');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector4.append(realVector25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector26);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector22 and openMapRealVector26.", arrayRealVector22.equals(openMapRealVector26) == openMapRealVector26.equals(arrayRealVector22));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        boolean boolean9 = openMapRealVector7.isDefaultValue((double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector7.mapAddToSelf(Double.NaN);
        openMapRealVector11.set((double) 100.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector14.append(openMapRealVector15);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector14.mapTan();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector14.mapExpm1ToSelf();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray20, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector14.projection(doubleArray20);
        double[] doubleArray27 = new double[] { 10, (-1.0d), (short) 0 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector23.append(doubleArray27);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector11.add(doubleArray27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector31.append(openMapRealVector32);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector31.mapTan();
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector31.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector31.mapAtanToSelf();
        boolean boolean37 = openMapRealVector31.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector11.ebeDivide((org.apache.commons.math.linear.RealVector) openMapRealVector31);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector28 and realVector30.", openMapRealVector28.equals(realVector30) == realVector30.equals(openMapRealVector28));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 10, (int) ' ');
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = arrayRealVector4.subtract(arrayRealVector9);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector9.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapLog1pToSelf();
        arrayRealVector14.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = arrayRealVector14.subtract(arrayRealVector19);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector19.projection(realVector24);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector19.mapCoshToSelf();
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray27, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector31.mapLog1pToSelf();
        arrayRealVector31.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector31.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector29, arrayRealVector31);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = arrayRealVector19.ebeDivide(arrayRealVector36);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector36.mapExpm1ToSelf();
        double double39 = arrayRealVector9.getLInfDistance((org.apache.commons.math.linear.RealVector) arrayRealVector36);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector9.mapTanhToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector42.mapLog1pToSelf();
        arrayRealVector42.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector47.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = arrayRealVector42.subtract(arrayRealVector47);
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector42.mapMultiplyToSelf((double) (short) 10);
        double[] doubleArray52 = arrayRealVector42.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray52, 0, (int) (byte) 10);
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector55.mapDivideToSelf((double) (byte) 1);
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector55.mapAtan();
        double[] doubleArray59 = arrayRealVector55.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray59, true);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector9.subtract(doubleArray59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector2.ebeMultiply(doubleArray59);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and arrayRealVector4.", openMapRealVector2.equals(arrayRealVector4) == arrayRealVector4.equals(openMapRealVector2));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector4);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector14.", arrayRealVector10.equals(openMapRealVector14) == openMapRealVector14.equals(arrayRealVector10));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2, arrayRealVector4);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapLog1pToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(realVector10);
        java.lang.Class<?> wildcardClass12 = realVector10.getClass();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector4 and openMapRealVector11.", arrayRealVector4.equals(openMapRealVector11) == openMapRealVector11.equals(arrayRealVector4));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        boolean boolean9 = openMapRealVector7.isDefaultValue((double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector7.mapAddToSelf(Double.NaN);
        openMapRealVector11.set((double) 100.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector14.append(openMapRealVector15);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector14.mapTan();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector14.mapExpm1ToSelf();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray20, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector14.projection(doubleArray20);
        double[] doubleArray27 = new double[] { 10, (-1.0d), (short) 0 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector23.append(doubleArray27);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector11.add(doubleArray27);
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray31, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector33.unitVector();
        double double35 = openMapRealVector34.getL1Norm();
        boolean boolean36 = openMapRealVector11.equals((java.lang.Object) double35);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector28 and realVector30.", openMapRealVector28.equals(realVector30) == realVector30.equals(openMapRealVector28));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 2.53E-321d, 1.0E-12d, Double.NaN, 100.0d };
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector6.mapLog10();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector5 and openMapRealVector6.", arrayRealVector5.equals(openMapRealVector6) == openMapRealVector6.equals(arrayRealVector5));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector5.append((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector10.append(openMapRealVector11);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector10.mapTan();
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector10.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector10.mapExpm1ToSelf();
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray16, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector10.projection(doubleArray16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.subtract(doubleArray16);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapCeilToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and realVector22.", openMapRealVector0.equals(realVector22) == realVector22.equals(openMapRealVector0));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(10, 1, (double) 1L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector3.mapAdd((double) (short) -1);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog1pToSelf();
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray9, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapLog1pToSelf();
        arrayRealVector13.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector13.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector11, arrayRealVector13);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector7, (org.apache.commons.math.linear.RealVector) arrayRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector22.append(openMapRealVector23);
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector23.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector26.append(openMapRealVector27);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector23.add(openMapRealVector27);
        arrayRealVector18.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector29);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector18.mapUlpToSelf();
        double double32 = arrayRealVector18.getLInfNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector36.mapLog1pToSelf();
        arrayRealVector36.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = arrayRealVector36.subtract(arrayRealVector41);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector41.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = arrayRealVector34.append(arrayRealVector41);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector34);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = arrayRealVector18.append(arrayRealVector34);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector47.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector47.mapAcosToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector51 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector51.mapLog1pToSelf();
        arrayRealVector51.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector56.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = arrayRealVector51.subtract(arrayRealVector56);
        org.apache.commons.math.linear.RealVector realVector59 = arrayRealVector56.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector61.mapLog1pToSelf();
        arrayRealVector61.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector66 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector67 = arrayRealVector66.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector68 = arrayRealVector61.subtract(arrayRealVector66);
        org.apache.commons.math.linear.RealVector realVector70 = arrayRealVector61.mapMultiplyToSelf((double) (short) 10);
        org.apache.commons.math.linear.RealVector realVector71 = arrayRealVector56.projection(realVector70);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector73 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector75 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector76 = arrayRealVector75.mapLog1pToSelf();
        arrayRealVector75.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector80 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector81 = arrayRealVector80.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector82 = arrayRealVector75.subtract(arrayRealVector80);
        org.apache.commons.math.linear.RealVector realVector83 = arrayRealVector80.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector84 = arrayRealVector73.append(arrayRealVector80);
        double[] doubleArray85 = arrayRealVector84.getData();
        double double86 = arrayRealVector84.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector87 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector56, (org.apache.commons.math.linear.RealVector) arrayRealVector84);
        double[] doubleArray88 = arrayRealVector56.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector89 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector47, doubleArray88);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector90 = openMapRealVector3.subtract(doubleArray88);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector3 and arrayRealVector7.", openMapRealVector3.equals(arrayRealVector7) == arrayRealVector7.equals(openMapRealVector3));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.append(openMapRealVector9);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector8.mapTan();
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector8.mapRintToSelf();
        double double13 = openMapRealVector8.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector8, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector1.append((org.apache.commons.math.linear.RealVector) openMapRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapLog1pToSelf();
        arrayRealVector18.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = arrayRealVector18.subtract(arrayRealVector23);
        double[] doubleArray32 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector23.data = doubleArray32;
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector23.mapAbsToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector36.mapLog1pToSelf();
        arrayRealVector36.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = arrayRealVector36.subtract(arrayRealVector41);
        double[] doubleArray50 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector41.data = doubleArray50;
        double[] doubleArray52 = arrayRealVector41.toArray();
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector23.subtract(doubleArray52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray52, true);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector1.append(doubleArray52);
        double double57 = openMapRealVector1.getLInfNorm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector23 and openMapRealVector56.", arrayRealVector23.equals(openMapRealVector56) == openMapRealVector56.equals(arrayRealVector23));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector5.append((double) 0.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapCbrtToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and realVector11.", openMapRealVector0.equals(realVector11) == realVector11.equals(openMapRealVector0));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        double double5 = arrayRealVector1.getNorm();
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector1.mapFloorToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector7.append(openMapRealVector8);
        org.apache.commons.math.linear.RealVector realVector10 = openMapRealVector7.mapTan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector11.append(openMapRealVector12);
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector12.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector15.append(openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector12.add(openMapRealVector16);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector19.append(openMapRealVector20);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector19.mapTan();
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector19.mapRintToSelf();
        double double24 = openMapRealVector19.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector19, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = openMapRealVector12.append((org.apache.commons.math.linear.RealVector) openMapRealVector19);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator28 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry29 = openMapRealVector19.new OpenMapEntry(iterator28);
        boolean boolean31 = openMapRealVector19.isDefaultValue((double) ' ');
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector19.mapAtan();
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray33, 0.0d);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector35.mapUlpToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = openMapRealVector19.add(openMapRealVector35);
        double[] doubleArray38 = openMapRealVector37.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector7.ebeDivide(doubleArray38);
        double[] doubleArray43 = new double[] { 10, (-1.0d), (short) 0 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray43);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray38, doubleArray43);
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector1.append(doubleArray43);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector44 and arrayRealVector45.", openMapRealVector44.equals(arrayRealVector45) == arrayRealVector45.equals(openMapRealVector44));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (byte) 1, 100.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector3.append(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector7.append(openMapRealVector8);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector4.add(openMapRealVector8);
        boolean boolean12 = openMapRealVector10.isDefaultValue((double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector10.mapAddToSelf(Double.NaN);
        openMapRealVector14.set((double) 100.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector17.append(openMapRealVector18);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector17.mapTan();
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector17.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector17.mapExpm1ToSelf();
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray23, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector17.projection(doubleArray23);
        double[] doubleArray30 = new double[] { 10, (-1.0d), (short) 0 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector26.append(doubleArray30);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector14.add(doubleArray30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector2.append(realVector33);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector31 and realVector33.", openMapRealVector31.equals(realVector33) == realVector33.equals(openMapRealVector31));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog1pToSelf();
        arrayRealVector7.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5, arrayRealVector7);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, (org.apache.commons.math.linear.RealVector) arrayRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector16.append(openMapRealVector17);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector17.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector20.append(openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector17.add(openMapRealVector21);
        arrayRealVector12.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector12.mapUlpToSelf();
        double double26 = arrayRealVector12.getLInfNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector28.mapLog1pToSelf();
        arrayRealVector28.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = arrayRealVector28.subtract(arrayRealVector33);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector28.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector28.checkVectorDimensions((int) (byte) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector42.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector42.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector42.mapAcosToSelf();
        double double46 = arrayRealVector28.getDistance(arrayRealVector42);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor47 = arrayRealVector28.iterator();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = arrayRealVector12.append(arrayRealVector28);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector28.mapCbrtToSelf();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector28.mapAcosToSelf();
        boolean boolean51 = arrayRealVector28.isInfinite();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector28.mapTanhToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector54.mapLog1pToSelf();
        arrayRealVector54.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector54.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector60 = arrayRealVector54.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector62 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector63 = arrayRealVector62.mapLog1pToSelf();
        arrayRealVector62.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector67 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector68 = arrayRealVector67.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector69 = arrayRealVector62.subtract(arrayRealVector67);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector71 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector72 = arrayRealVector71.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector73 = arrayRealVector67.projection(realVector72);
        org.apache.commons.math.linear.RealVector realVector74 = arrayRealVector67.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector75 = arrayRealVector54.projection(arrayRealVector67);
        double[] doubleArray76 = arrayRealVector67.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray76);
        org.apache.commons.math.linear.RealVector realVector78 = arrayRealVector28.add(doubleArray76);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector67 and openMapRealVector77.", arrayRealVector67.equals(openMapRealVector77) == openMapRealVector77.equals(arrayRealVector67));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector2 = new org.apache.commons.math.linear.ArrayRealVector((int) (byte) 0, (double) (-1L));
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector3.append(openMapRealVector4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = openMapRealVector6.append(openMapRealVector7);
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector7.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double11 = openMapRealVector7.dotProduct(openMapRealVector10);
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector10.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = openMapRealVector10.mapDivideToSelf((double) (short) -1);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector10.mapSinh();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector10.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector10.mapAdd(3.1622776601683794E-12d);
        double double19 = openMapRealVector3.getDistance(openMapRealVector18);
        org.apache.commons.math.linear.RealVector realVector20 = openMapRealVector3.mapTanToSelf();
        arrayRealVector2.checkVectorDimensions(realVector20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector2 and realVector20.", arrayRealVector2.equals(realVector20) == realVector20.equals(arrayRealVector2));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector3.mapLog1pToSelf();
        arrayRealVector3.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = arrayRealVector3.subtract(arrayRealVector8);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector1.append(arrayRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapTanh();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector13);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator16 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry17 = openMapRealVector15.new OpenMapEntry(iterator16);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector15.", arrayRealVector1.equals(openMapRealVector15) == openMapRealVector15.equals(arrayRealVector1));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector0.mapTan();
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector0.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector5 = openMapRealVector0.mapExpm1ToSelf();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray6, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector0.projection(doubleArray6);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector10.append(openMapRealVector11);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector11.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double15 = openMapRealVector11.dotProduct(openMapRealVector14);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector14.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector14.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.mapSignumToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector0.add(openMapRealVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapLog1pToSelf();
        arrayRealVector21.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapLog1pToSelf();
        arrayRealVector26.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector31.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = arrayRealVector26.subtract(arrayRealVector31);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector21, arrayRealVector31);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector21.mapCos();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector21.mapUlp();
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector21.mapAddToSelf((double) 1L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector39.append(openMapRealVector40);
        double[] doubleArray42 = openMapRealVector40.toArray();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector21.append(doubleArray42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector44.append(openMapRealVector45);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector45.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector48.append(openMapRealVector49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = openMapRealVector45.add(openMapRealVector49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector49.append((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector54.append(openMapRealVector55);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector54.mapTan();
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector54.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector54.mapExpm1ToSelf();
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray60, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector54.projection(doubleArray60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = openMapRealVector49.subtract(doubleArray60);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector65 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray42, doubleArray60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector19.ebeMultiply(doubleArray42);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and arrayRealVector65.", openMapRealVector0.equals(arrayRealVector65) == arrayRealVector65.equals(openMapRealVector0));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 2.53E-321d, 1.0E-12d, Double.NaN, 100.0d };
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4);
        int int8 = openMapRealVector7.getDimension();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector5 and openMapRealVector7.", arrayRealVector5.equals(openMapRealVector7) == openMapRealVector7.equals(arrayRealVector5));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector1.mapMultiplyToSelf((double) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector1.mapSinhToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector(realVector11);
        boolean boolean14 = openMapRealVector12.isDefaultValue((double) (byte) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector12.", arrayRealVector1.equals(openMapRealVector12) == openMapRealVector12.equals(arrayRealVector1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 2.53E-321d, 1.0E-12d, Double.NaN, 100.0d };
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4, 4.9E-323d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector5 and openMapRealVector8.", arrayRealVector5.equals(openMapRealVector8) == openMapRealVector8.equals(arrayRealVector5));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.RealVector realVector2 = openMapRealVector0.mapAdd(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector0, (int) (byte) 1);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector0.mapPow((double) (short) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        arrayRealVector8.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = arrayRealVector8.subtract(arrayRealVector13);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector13.projection(realVector18);
        double[] doubleArray20 = arrayRealVector13.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector0.append(doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray20, (-0.0d));
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector8 and openMapRealVector21.", arrayRealVector8.equals(openMapRealVector21) == openMapRealVector21.equals(arrayRealVector8));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector3.mapLog1pToSelf();
        arrayRealVector3.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = arrayRealVector3.subtract(arrayRealVector8);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector1.append(arrayRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapTanh();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector13);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector15.mapLog();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector15.", arrayRealVector1.equals(openMapRealVector15) == openMapRealVector15.equals(arrayRealVector1));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray2 = arrayRealVector1.getDataRef();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapCosToSelf();
        double[] doubleArray4 = arrayRealVector1.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4, false);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector7.mapSqrtToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and realVector8.", arrayRealVector1.equals(realVector8) == realVector8.equals(arrayRealVector1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2);
        org.apache.commons.math.linear.RealVector realVector5 = openMapRealVector2.mapAsinToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector5 and arrayRealVector4.", realVector5.equals(arrayRealVector4) == arrayRealVector4.equals(realVector5));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector1.mapSin();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector1.mapAcosToSelf();
        boolean boolean8 = openMapRealVector1.isNaN();
        double double9 = openMapRealVector1.getSparcity();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector1);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapLog1pToSelf();
        arrayRealVector12.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = arrayRealVector12.subtract(arrayRealVector17);
        double[] doubleArray26 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector17.data = doubleArray26;
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector17.mapAbsToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector30.mapLog1pToSelf();
        arrayRealVector30.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = arrayRealVector30.subtract(arrayRealVector35);
        double[] doubleArray44 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector35.data = doubleArray44;
        double[] doubleArray46 = arrayRealVector35.toArray();
        double double47 = arrayRealVector17.getDistance(doubleArray46);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray46, true);
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector49.mapSinh();
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector49.mapAbsToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector53 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector53.mapLog1pToSelf();
        arrayRealVector53.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector59 = arrayRealVector58.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector60 = arrayRealVector53.subtract(arrayRealVector58);
        double[] doubleArray67 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector58.data = doubleArray67;
        org.apache.commons.math.linear.RealVector realVector69 = arrayRealVector58.mapAbsToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector71 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector72 = arrayRealVector71.mapLog1pToSelf();
        arrayRealVector71.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector76 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector77 = arrayRealVector76.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector78 = arrayRealVector71.subtract(arrayRealVector76);
        double[] doubleArray85 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector76.data = doubleArray85;
        double[] doubleArray87 = arrayRealVector76.toArray();
        double double88 = arrayRealVector58.getDistance(doubleArray87);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector90 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray87, true);
        org.apache.commons.math.linear.RealVector realVector91 = arrayRealVector90.mapSinh();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector92 = new org.apache.commons.math.linear.ArrayRealVector(realVector51, arrayRealVector90);
        org.apache.commons.math.linear.RealVector realVector93 = arrayRealVector92.mapAcos();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector94 = openMapRealVector1.append((org.apache.commons.math.linear.RealVector) arrayRealVector92);
        double[] doubleArray95 = arrayRealVector92.toArray();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector92 and openMapRealVector94.", arrayRealVector92.equals(openMapRealVector94) == openMapRealVector94.equals(arrayRealVector92));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector1.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapLog1pToSelf();
        arrayRealVector9.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = arrayRealVector9.subtract(arrayRealVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector14.projection(realVector19);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector14.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = arrayRealVector1.projection(arrayRealVector14);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector22.mapSin();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor24 = arrayRealVector22.iterator();
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector22.mapAbsToSelf();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector22.mapExpToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector22);
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector27.mapSignum();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector14 and openMapRealVector27.", arrayRealVector14.equals(openMapRealVector27) == openMapRealVector27.equals(arrayRealVector14));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        arrayRealVector6.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = arrayRealVector6.subtract(arrayRealVector11);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, arrayRealVector11);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector1.mapCos();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector1.mapUlp();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector1.mapAddToSelf((double) 1L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector19.append(openMapRealVector20);
        double[] doubleArray22 = openMapRealVector20.toArray();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector1.append(doubleArray22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector24.append(openMapRealVector25);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector25.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector28.append(openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector25.add(openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector29.append((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector34.append(openMapRealVector35);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector34.mapTan();
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector34.mapExpm1ToSelf();
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray40, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector34.projection(doubleArray40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector29.subtract(doubleArray40);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray22, doubleArray40);
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector45.mapMultiplyToSelf((double) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector19 and realVector47.", openMapRealVector19.equals(realVector47) == realVector47.equals(openMapRealVector19));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector3.mapLog1pToSelf();
        arrayRealVector3.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = arrayRealVector3.subtract(arrayRealVector8);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector1.append(arrayRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapTanh();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector13);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapLog1pToSelf();
        arrayRealVector17.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector22.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = arrayRealVector17.subtract(arrayRealVector22);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector17.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector17.checkVectorDimensions((int) (byte) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector17);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector31.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector31.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector31.mapAcosToSelf();
        double double35 = arrayRealVector17.getDistance(arrayRealVector31);
        double[] doubleArray36 = arrayRealVector31.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray36);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector39.mapLog1pToSelf();
        arrayRealVector39.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector39.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector39.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector47.mapLog1pToSelf();
        arrayRealVector47.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector52.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = arrayRealVector47.subtract(arrayRealVector52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector56.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector52.projection(realVector57);
        org.apache.commons.math.linear.RealVector realVector59 = arrayRealVector52.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector60 = arrayRealVector39.projection(arrayRealVector52);
        double[] doubleArray61 = arrayRealVector52.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector63 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector63.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector65 = arrayRealVector63.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector66 = arrayRealVector63.mapAcosToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector67.append(openMapRealVector68);
        org.apache.commons.math.linear.RealVector realVector70 = openMapRealVector67.mapTan();
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector73 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector74 = arrayRealVector73.mapLog1pToSelf();
        arrayRealVector73.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector77 = arrayRealVector73.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector79 = arrayRealVector73.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector80 = arrayRealVector73.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector81 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector67, arrayRealVector73);
        double[] doubleArray82 = arrayRealVector73.toArray();
        org.apache.commons.math.linear.RealVector realVector83 = arrayRealVector63.subtract(doubleArray82);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector84 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray61, doubleArray82);
        double double85 = arrayRealVector37.getL1Distance(doubleArray82);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector15.append(doubleArray82);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector15.", arrayRealVector1.equals(openMapRealVector15) == openMapRealVector15.equals(arrayRealVector1));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray2 = arrayRealVector1.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray2);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapLog1pToSelf();
        arrayRealVector5.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector5.subtract(arrayRealVector10);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector5.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector5.checkVectorDimensions((int) (byte) 10);
        double[] doubleArray17 = arrayRealVector5.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray17);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = openMapRealVector3.outerProduct(doubleArray17);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector3.", arrayRealVector1.equals(openMapRealVector3) == openMapRealVector3.equals(arrayRealVector1));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector3.mapLog1pToSelf();
        arrayRealVector3.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = arrayRealVector3.subtract(arrayRealVector8);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector1.append(arrayRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapTanh();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector13);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector13.mapFloorToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector15.", arrayRealVector1.equals(openMapRealVector15) == openMapRealVector15.equals(arrayRealVector1));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapDivideToSelf((double) (short) -1);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = arrayRealVector10.subtract(arrayRealVector15);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector15.mapDivideToSelf(Double.NaN);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector15.mapAbs();
        double double21 = arrayRealVector15.getL1Norm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector15);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapLog1pToSelf();
        arrayRealVector26.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector31.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = arrayRealVector26.subtract(arrayRealVector31);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector31.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = arrayRealVector24.append(arrayRealVector31);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector24.mapLogToSelf();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector24.mapTanToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector22.append((org.apache.commons.math.linear.RealVector) arrayRealVector24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector15 and openMapRealVector22.", arrayRealVector15.equals(openMapRealVector22) == openMapRealVector22.equals(arrayRealVector15));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector3.mapLog1pToSelf();
        arrayRealVector3.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = arrayRealVector3.subtract(arrayRealVector8);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector1.append(arrayRealVector8);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector1.mapLogToSelf();
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector1.mapAcos();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector1.mapSignumToSelf();
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray16, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapLog1pToSelf();
        arrayRealVector20.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector20.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector18, arrayRealVector20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapLog1pToSelf();
        arrayRealVector27.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector27.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector27.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapLog1pToSelf();
        arrayRealVector35.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector40.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = arrayRealVector35.subtract(arrayRealVector40);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector44 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector44.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector40.projection(realVector45);
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector40.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = arrayRealVector27.projection(arrayRealVector40);
        double[] doubleArray49 = arrayRealVector40.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector51 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector51.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector51.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector51.mapAcosToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector55.append(openMapRealVector56);
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector55.mapTan();
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector55.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector61.mapLog1pToSelf();
        arrayRealVector61.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector65 = arrayRealVector61.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector67 = arrayRealVector61.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector68 = arrayRealVector61.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector69 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector55, arrayRealVector61);
        double[] doubleArray70 = arrayRealVector61.toArray();
        org.apache.commons.math.linear.RealVector realVector71 = arrayRealVector51.subtract(doubleArray70);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector72 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray49, doubleArray70);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector73 = openMapRealVector18.append(doubleArray70);
        double double74 = arrayRealVector1.getDistance(doubleArray70);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector61 and openMapRealVector73.", arrayRealVector61.equals(openMapRealVector73) == openMapRealVector73.equals(arrayRealVector61));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 2.53E-321d, 1.0E-12d, Double.NaN, 100.0d };
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4);
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator8 = openMapRealVector7.new OpenMapSparseIterator();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector5 and openMapRealVector7.", arrayRealVector5.equals(openMapRealVector7) == openMapRealVector7.equals(arrayRealVector5));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector3.mapLog1pToSelf();
        arrayRealVector3.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = arrayRealVector3.subtract(arrayRealVector8);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector1.append(arrayRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapTanh();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector13);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector15.mapDivide((double) 0);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector15.", arrayRealVector1.equals(openMapRealVector15) == openMapRealVector15.equals(arrayRealVector1));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog1pToSelf();
        arrayRealVector7.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5, arrayRealVector7);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, (org.apache.commons.math.linear.RealVector) arrayRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector16.append(openMapRealVector17);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector17.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector20.append(openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector17.add(openMapRealVector21);
        arrayRealVector12.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector12.mapUlpToSelf();
        double double26 = arrayRealVector12.getLInfNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector30.mapLog1pToSelf();
        arrayRealVector30.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = arrayRealVector30.subtract(arrayRealVector35);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector35.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = arrayRealVector28.append(arrayRealVector35);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = arrayRealVector12.append(arrayRealVector28);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector28.mapTan();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector28.mapFloorToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector46.mapLog1pToSelf();
        arrayRealVector46.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector51 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector51.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector53 = arrayRealVector46.subtract(arrayRealVector51);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector46.mapMultiplyToSelf((double) (short) 10);
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector46.mapSinhToSelf();
        double[] doubleArray57 = arrayRealVector46.getData();
        org.apache.commons.math.linear.RealMatrix realMatrix58 = openMapRealVector44.outerProduct(doubleArray57);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector44.", arrayRealVector1.equals(openMapRealVector44) == openMapRealVector44.equals(arrayRealVector1));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector3.append(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector7.append(openMapRealVector8);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector4.add(openMapRealVector8);
        boolean boolean11 = openMapRealVector2.equals((java.lang.Object) openMapRealVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(0);
        double[] doubleArray14 = arrayRealVector13.getData();
        double double15 = openMapRealVector10.getLInfDistance(doubleArray14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and arrayRealVector13.", openMapRealVector0.equals(arrayRealVector13) == arrayRealVector13.equals(openMapRealVector0));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapDivideToSelf((double) (short) -1);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = arrayRealVector10.subtract(arrayRealVector15);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector15.mapDivideToSelf(Double.NaN);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector15.mapAbs();
        double double21 = arrayRealVector15.getL1Norm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector15);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapLog1pToSelf();
        arrayRealVector24.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector29.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = arrayRealVector24.subtract(arrayRealVector29);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector29.projection(realVector34);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector29.mapSubtract((double) 100L);
        double[] doubleArray38 = arrayRealVector29.data;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector4.append(doubleArray38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector15 and openMapRealVector22.", arrayRealVector15.equals(openMapRealVector22) == openMapRealVector22.equals(arrayRealVector15));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapDivideToSelf((double) (short) -1);
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector4.mapAcos();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        arrayRealVector11.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = arrayRealVector11.subtract(arrayRealVector16);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector11.getSubVector(10, (int) (byte) 0);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector11.mapCbrt();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector11.mapLog10();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector11);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and realVector21.", openMapRealVector0.equals(realVector21) == realVector21.equals(openMapRealVector0));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector10);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector10.mapSubtractToSelf((double) (-1.0f));
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector10.mapAbsToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector10.append(3.1622776601683794E-12d);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector10.mapSinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector22.mapLog1pToSelf();
        arrayRealVector22.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector22.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector22.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector30.mapLog1pToSelf();
        arrayRealVector30.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = arrayRealVector30.subtract(arrayRealVector35);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector39.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector35.projection(realVector40);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector35.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = arrayRealVector22.projection(arrayRealVector35);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector45.append(openMapRealVector46);
        arrayRealVector35.setSubVector((int) (short) 100, (org.apache.commons.math.linear.RealVector) openMapRealVector45);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray51 = arrayRealVector50.getDataRef();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector50.mapCosToSelf();
        double[] doubleArray53 = arrayRealVector50.getData();
        double double54 = arrayRealVector35.dotProduct(doubleArray53);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector56.mapLog1pToSelf();
        arrayRealVector56.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector61.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector63 = arrayRealVector56.subtract(arrayRealVector61);
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector61.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector66 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector67 = arrayRealVector66.mapLog1pToSelf();
        arrayRealVector66.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector71 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector72 = arrayRealVector71.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector73 = arrayRealVector66.subtract(arrayRealVector71);
        org.apache.commons.math.linear.RealVector realVector75 = arrayRealVector66.mapMultiplyToSelf((double) (short) 10);
        org.apache.commons.math.linear.RealVector realVector76 = arrayRealVector61.projection(realVector75);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector78 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector80 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector81 = arrayRealVector80.mapLog1pToSelf();
        arrayRealVector80.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector85 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector86 = arrayRealVector85.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector87 = arrayRealVector80.subtract(arrayRealVector85);
        org.apache.commons.math.linear.RealVector realVector88 = arrayRealVector85.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector89 = arrayRealVector78.append(arrayRealVector85);
        double[] doubleArray90 = arrayRealVector89.getData();
        double double91 = arrayRealVector89.getL1Norm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector92 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector61, (org.apache.commons.math.linear.RealVector) arrayRealVector89);
        org.apache.commons.math.linear.RealMatrix realMatrix93 = arrayRealVector35.outerProduct(arrayRealVector61);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector94 = arrayRealVector10.append(arrayRealVector61);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector14 and arrayRealVector22.", openMapRealVector14.equals(arrayRealVector22) == arrayRealVector22.equals(openMapRealVector14));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector1.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector1.checkVectorDimensions((int) (byte) 10);
        double[] doubleArray13 = arrayRealVector1.toArray();
        double double15 = arrayRealVector1.getEntry((int) (short) 0);
        double[] doubleArray16 = arrayRealVector1.getDataRef();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector1.mapPowToSelf(10.0d);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector1.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector22.mapLog1pToSelf();
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector28.mapLog1pToSelf();
        arrayRealVector28.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector28.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector26, arrayRealVector28);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector22, (org.apache.commons.math.linear.RealVector) arrayRealVector33);
        double double36 = arrayRealVector22.getLInfNorm();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector22.mapLog10ToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector39.mapLog1pToSelf();
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray41, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector45.mapLog1pToSelf();
        arrayRealVector45.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector45.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector50 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector43, arrayRealVector45);
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector50.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector39, (org.apache.commons.math.linear.RealVector) arrayRealVector50);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector54.append(openMapRealVector55);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector55.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = openMapRealVector58.append(openMapRealVector59);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector55.add(openMapRealVector59);
        arrayRealVector50.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector61);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector64 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector65 = arrayRealVector64.mapLog1pToSelf();
        arrayRealVector64.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector69 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector70 = arrayRealVector69.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector71 = arrayRealVector64.subtract(arrayRealVector69);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector72 = arrayRealVector50.subtract(arrayRealVector64);
        double[] doubleArray73 = arrayRealVector72.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector75 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray76 = arrayRealVector75.getDataRef();
        org.apache.commons.math.linear.RealVector realVector77 = arrayRealVector75.mapCosToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector78 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray73, arrayRealVector75);
        org.apache.commons.math.linear.RealVector realVector79 = arrayRealVector22.subtract(doubleArray73);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector80 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray73);
        org.apache.commons.math.linear.RealVector realVector81 = arrayRealVector1.add(doubleArray73);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector80.", arrayRealVector1.equals(openMapRealVector80) == openMapRealVector80.equals(arrayRealVector1));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.lang.Double[] doubleArray1 = new java.lang.Double[] { 10.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray1, 1.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray1);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector3 and arrayRealVector4.", openMapRealVector3.equals(arrayRealVector4) == arrayRealVector4.equals(openMapRealVector3));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2, arrayRealVector4);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapSignumToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector9.append(1.0E-12d);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector9.append((double) (byte) 1);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector9.mapDivideToSelf((double) 0.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapLog1pToSelf();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray20, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapLog1pToSelf();
        arrayRealVector24.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector24.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector22, arrayRealVector24);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector29.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector18, (org.apache.commons.math.linear.RealVector) arrayRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector33.append(openMapRealVector34);
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector34.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = openMapRealVector37.append(openMapRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector34.add(openMapRealVector38);
        arrayRealVector29.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector40);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector29.mapUlpToSelf();
        double double43 = arrayRealVector29.getLInfNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector47.mapLog1pToSelf();
        arrayRealVector47.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector52.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = arrayRealVector47.subtract(arrayRealVector52);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector52.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = arrayRealVector45.append(arrayRealVector52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector57 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector45);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = arrayRealVector29.append(arrayRealVector45);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector59 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector58);
        arrayRealVector58.set((double) (byte) -1);
        double[] doubleArray62 = arrayRealVector58.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector65 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray62, 10, 0);
        org.apache.commons.math.linear.RealVector realVector66 = arrayRealVector9.append(doubleArray62);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and arrayRealVector65.", openMapRealVector2.equals(arrayRealVector65) == arrayRealVector65.equals(openMapRealVector2));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        arrayRealVector6.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = arrayRealVector6.subtract(arrayRealVector11);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, arrayRealVector11);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector1.mapCos();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector1.mapUlp();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector1.mapTanToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector1.mapSqrtToSelf();
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray19, 0.0d);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector21.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapLog1pToSelf();
        arrayRealVector24.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector29.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = arrayRealVector24.subtract(arrayRealVector29);
        double[] doubleArray38 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector29.data = doubleArray38;
        double[] doubleArray40 = arrayRealVector29.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector21.append(doubleArray40);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, doubleArray40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector29 and openMapRealVector41.", arrayRealVector29.equals(openMapRealVector41) == openMapRealVector41.equals(arrayRealVector29));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector4.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapLog1pToSelf();
        arrayRealVector12.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = arrayRealVector12.subtract(arrayRealVector17);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector17.projection(realVector22);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector17.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = arrayRealVector4.projection(arrayRealVector17);
        double[] doubleArray26 = arrayRealVector17.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector27.append(openMapRealVector28);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector27.mapTan();
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog1pToSelf();
        arrayRealVector33.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector33.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector33.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector33.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector27, arrayRealVector33);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapSqrt();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26, arrayRealVector41);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector0.append(doubleArray26);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26, true);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector17 and openMapRealVector44.", arrayRealVector17.equals(openMapRealVector44) == openMapRealVector44.equals(arrayRealVector17));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector5.append((double) 0.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5);
        double double11 = arrayRealVector10.getNorm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and arrayRealVector10.", openMapRealVector0.equals(arrayRealVector10) == arrayRealVector10.equals(openMapRealVector0));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector0.mapTan();
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector0.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        arrayRealVector6.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector6.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector6.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector6.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector0, arrayRealVector6);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector0.mapCosh();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector0, 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray20 = arrayRealVector19.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray20);
        double double22 = openMapRealVector17.getL1Distance(doubleArray20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector17 and arrayRealVector19.", openMapRealVector17.equals(arrayRealVector19) == arrayRealVector19.equals(openMapRealVector17));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapLog1pToSelf();
        arrayRealVector5.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector5.subtract(arrayRealVector10);
        double[] doubleArray19 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector10.data = doubleArray19;
        double[] doubleArray21 = arrayRealVector10.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector2.append(doubleArray21);
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector2.mapUlp();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector22.", arrayRealVector10.equals(openMapRealVector22) == openMapRealVector22.equals(arrayRealVector10));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog1pToSelf();
        arrayRealVector16.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapLog1pToSelf();
        arrayRealVector21.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = arrayRealVector21.subtract(arrayRealVector26);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector16, arrayRealVector26);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector16.mapCos();
        double double31 = arrayRealVector16.getNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector16);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray35 = arrayRealVector34.getDataRef();
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector34.mapCosToSelf();
        double[] doubleArray37 = arrayRealVector34.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray37, false);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = arrayRealVector16.subtract(arrayRealVector39);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector42.mapLog1pToSelf();
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray44, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector48.mapLog1pToSelf();
        arrayRealVector48.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector48.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector53 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector46, arrayRealVector48);
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector53.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector42, (org.apache.commons.math.linear.RealVector) arrayRealVector53);
        double[] doubleArray56 = arrayRealVector42.getData();
        arrayRealVector39.data = doubleArray56;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector14.ebeMultiply(doubleArray56);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector14.", arrayRealVector10.equals(openMapRealVector14) == openMapRealVector14.equals(arrayRealVector10));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapAcosToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector8);
        double double13 = arrayRealVector8.getL1Norm();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector8 and openMapRealVector12.", arrayRealVector8.equals(openMapRealVector12) == openMapRealVector12.equals(arrayRealVector8));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector6.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        arrayRealVector11.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = arrayRealVector11.subtract(arrayRealVector16);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector16.projection(realVector21);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector16.mapCoshToSelf();
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector28.mapLog1pToSelf();
        arrayRealVector28.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector28.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector26, arrayRealVector28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = arrayRealVector16.ebeDivide(arrayRealVector33);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapExpm1ToSelf();
        double double36 = arrayRealVector6.getLInfDistance((org.apache.commons.math.linear.RealVector) arrayRealVector33);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray39 = arrayRealVector38.getDataRef();
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector38.mapCeilToSelf();
        double double41 = arrayRealVector6.getLInfDistance(arrayRealVector38);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector42.append(openMapRealVector43);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector43.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector46.append(openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector43.add(openMapRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = openMapRealVector47.append((double) 0.0f);
        double double52 = openMapRealVector47.getLInfNorm();
        double[] doubleArray53 = openMapRealVector47.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray53, 3.1622776601683795d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray53);
        arrayRealVector6.data = doubleArray53;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector6 and openMapRealVector26.", arrayRealVector6.equals(openMapRealVector26) == openMapRealVector26.equals(arrayRealVector6));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = openMapRealVector3.append(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector3.mapTan();
        double double7 = openMapRealVector1.getL1Distance(openMapRealVector3);
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator8 = openMapRealVector3.new OpenMapSparseIterator();
        boolean boolean10 = openMapRealVector3.isDefaultValue(0.9999999999999999d);
        java.lang.Double[] doubleArray12 = new java.lang.Double[] { 10.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12, 1.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray12, (int) (short) 0, 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12, (double) 1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector3.append(openMapRealVector20);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and arrayRealVector18.", openMapRealVector0.equals(arrayRealVector18) == arrayRealVector18.equals(openMapRealVector0));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector0.mapTan();
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector0.mapRintToSelf();
        double double5 = openMapRealVector0.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector0, (int) (short) 0);
        double double8 = openMapRealVector0.getSparcity();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector0.mapSinh();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector0);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapSubtractToSelf(1.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and realVector12.", openMapRealVector0.equals(realVector12) == realVector12.equals(openMapRealVector0));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 2.53E-321d, 1.0E-12d, Double.NaN, 100.0d };
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4, (double) 'a');
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector5 and openMapRealVector6.", arrayRealVector5.equals(openMapRealVector6) == openMapRealVector6.equals(arrayRealVector5));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapDivideToSelf((double) (short) -1);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = arrayRealVector10.subtract(arrayRealVector15);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector15.mapDivideToSelf(Double.NaN);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector15.mapAbs();
        double double21 = arrayRealVector15.getL1Norm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector15);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector15.mapSignumToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector23 and openMapRealVector22.", realVector23.equals(openMapRealVector22) == openMapRealVector22.equals(realVector23));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        arrayRealVector6.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = arrayRealVector6.subtract(arrayRealVector11);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, arrayRealVector11);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector14, true);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray17, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector16, doubleArray17);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapTanh();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        boolean boolean25 = arrayRealVector20.equals((java.lang.Object) arrayRealVector23);
        double[] doubleArray26 = arrayRealVector23.getData();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector23.mapLog1p();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector28.append(openMapRealVector29);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector29.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double33 = openMapRealVector29.dotProduct(openMapRealVector32);
        org.apache.commons.math.linear.RealVector realVector34 = openMapRealVector32.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector32.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector36 = openMapRealVector32.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector38.mapLog1pToSelf();
        arrayRealVector38.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector32.append((org.apache.commons.math.linear.RealVector) arrayRealVector38);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector38.mapSubtractToSelf((double) (-1.0f));
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector38.mapAbsToSelf();
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector38.append(3.1622776601683794E-12d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = arrayRealVector23.ebeDivide(arrayRealVector38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector42.", arrayRealVector1.equals(openMapRealVector42) == openMapRealVector42.equals(arrayRealVector1));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector2.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapExpm1();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and arrayRealVector4.", openMapRealVector2.equals(arrayRealVector4) == arrayRealVector4.equals(openMapRealVector2));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        boolean boolean6 = openMapRealVector4.isInfinite();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        arrayRealVector8.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = arrayRealVector8.subtract(arrayRealVector13);
        double[] doubleArray22 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector13.data = doubleArray22;
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector13.mapAbsToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapLog1pToSelf();
        arrayRealVector26.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector31.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = arrayRealVector26.subtract(arrayRealVector31);
        double[] doubleArray40 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector31.data = doubleArray40;
        double[] doubleArray42 = arrayRealVector31.toArray();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector13.subtract(doubleArray42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector4.append(doubleArray42);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector4);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector13 and openMapRealVector44.", arrayRealVector13.equals(openMapRealVector44) == openMapRealVector44.equals(arrayRealVector13));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor3 = openMapRealVector0.iterator();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector0, (int) (byte) -1);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector5.mapInvToSelf();
        boolean boolean8 = openMapRealVector5.isDefaultValue(1.4711276743037347d);
        boolean boolean9 = openMapRealVector5.isInfinite();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector10.append(openMapRealVector11);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector11.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector14.append(openMapRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector11.add(openMapRealVector15);
        boolean boolean19 = openMapRealVector17.isDefaultValue((double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector17.mapAddToSelf(Double.NaN);
        org.apache.commons.math.linear.RealVector realVector22 = openMapRealVector21.mapRint();
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector21.mapCosh();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapLog1pToSelf();
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray27, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector31.mapLog1pToSelf();
        arrayRealVector31.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector31.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector29, arrayRealVector31);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector36.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector25, (org.apache.commons.math.linear.RealVector) arrayRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector40.append(openMapRealVector41);
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector41.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector44.append(openMapRealVector45);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector41.add(openMapRealVector45);
        arrayRealVector36.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector36.mapUlpToSelf();
        double double50 = arrayRealVector36.getLInfNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector54.mapLog1pToSelf();
        arrayRealVector54.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector59 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector60 = arrayRealVector59.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = arrayRealVector54.subtract(arrayRealVector59);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector59.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector63 = arrayRealVector52.append(arrayRealVector59);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector64 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector65 = arrayRealVector36.append(arrayRealVector52);
        org.apache.commons.math.linear.RealVector realVector66 = arrayRealVector65.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector67 = arrayRealVector65.mapAcosToSelf();
        org.apache.commons.math.linear.RealVector realVector68 = arrayRealVector65.mapTanToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector21.append((org.apache.commons.math.linear.RealVector) arrayRealVector65);
        double double70 = openMapRealVector5.getL1Distance(openMapRealVector69);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector65 and openMapRealVector69.", arrayRealVector65.equals(openMapRealVector69) == openMapRealVector69.equals(arrayRealVector65));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapDivideToSelf((double) (short) -1);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = arrayRealVector10.subtract(arrayRealVector15);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector15.mapDivideToSelf(Double.NaN);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector15.mapAbs();
        double double21 = arrayRealVector15.getL1Norm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector15);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector24.append(openMapRealVector25);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector24.mapTan();
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.mapRintToSelf();
        double double29 = openMapRealVector24.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector24, (int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector32 = openMapRealVector31.mapTanh();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector33.append(openMapRealVector34);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector36.append(openMapRealVector37);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector36.mapTan();
        double double40 = openMapRealVector34.getL1Distance(openMapRealVector36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector31.add(openMapRealVector34);
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector34.mapExp();
        double[] doubleArray43 = openMapRealVector34.toArray();
        java.util.Iterator<org.apache.commons.math.linear.RealVector.Entry> entryItor44 = openMapRealVector34.sparseIterator();
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector34.mapUlp();
        openMapRealVector22.setSubVector((int) (short) 1, (org.apache.commons.math.linear.RealVector) openMapRealVector34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector15 and openMapRealVector22.", arrayRealVector15.equals(openMapRealVector22) == openMapRealVector22.equals(arrayRealVector15));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector6.projection(realVector11);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector6.mapSubtract((double) 100L);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector6.mapCosh();
        boolean boolean16 = arrayRealVector6.isNaN();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector6.mapAbs();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector18.append(openMapRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector21.append(openMapRealVector22);
        org.apache.commons.math.linear.RealVector realVector24 = openMapRealVector21.mapTan();
        double double25 = openMapRealVector19.getL1Distance(openMapRealVector21);
        double double26 = openMapRealVector21.getNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray29 = arrayRealVector28.getDataRef();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector28.mapLog1p();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector32.mapLog1pToSelf();
        arrayRealVector32.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector37.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = arrayRealVector32.subtract(arrayRealVector37);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector37.projection(realVector42);
        double[] doubleArray44 = arrayRealVector37.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 100);
        org.apache.commons.math.linear.RealVector realVector47 = openMapRealVector46.mapTanhToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector37, (org.apache.commons.math.linear.RealVector) openMapRealVector46);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector28.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector37);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = openMapRealVector21.append(realVector49);
        double double51 = arrayRealVector6.dotProduct(realVector49);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector50.", arrayRealVector1.equals(openMapRealVector50) == openMapRealVector50.equals(arrayRealVector1));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector4.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        arrayRealVector10.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector10);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector10.mapSubtractToSelf((double) (-1.0f));
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector10.mapAbsToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector10.append(3.1622776601683794E-12d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray22 = arrayRealVector21.getDataRef();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector21.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector21.mapAtan();
        double double25 = arrayRealVector21.getLInfNorm();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector21.mapAddToSelf((double) (short) 100);
        double[] doubleArray28 = arrayRealVector21.data;
        arrayRealVector10.data = doubleArray28;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector14 and realVector23.", openMapRealVector14.equals(realVector23) == realVector23.equals(openMapRealVector14));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapDivideToSelf((double) (short) -1);
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector4.mapSinh();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector10.append(1.4711276743037347d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector14.append(openMapRealVector15);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector15.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector18.append(openMapRealVector19);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector15.add(openMapRealVector19);
        boolean boolean23 = openMapRealVector21.isDefaultValue((double) 'a');
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = openMapRealVector21.mapAdd(2.53E-321d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = openMapRealVector26.append(openMapRealVector27);
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector26.mapTan();
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector26.mapRintToSelf();
        double double31 = openMapRealVector26.getNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog1pToSelf();
        arrayRealVector33.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector38.mapLog1pToSelf();
        arrayRealVector38.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector43.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = arrayRealVector38.subtract(arrayRealVector43);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector33, arrayRealVector43);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector48 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector46, true);
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray49, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector48, doubleArray49);
        double double53 = openMapRealVector26.getDistance(doubleArray49);
        double double54 = openMapRealVector21.getDistance(doubleArray49);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector55.append(openMapRealVector56);
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector56.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = openMapRealVector59.append(openMapRealVector60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector56.add(openMapRealVector60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector63.append(openMapRealVector64);
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector63.mapTan();
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector63.mapRintToSelf();
        double double68 = openMapRealVector63.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector63, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector56.append((org.apache.commons.math.linear.RealVector) openMapRealVector63);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator72 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry73 = openMapRealVector63.new OpenMapEntry(iterator72);
        boolean boolean75 = openMapRealVector63.isDefaultValue((double) ' ');
        org.apache.commons.math.linear.RealVector realVector76 = openMapRealVector63.mapAtan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = openMapRealVector77.append(openMapRealVector78);
        org.apache.commons.math.linear.RealVector realVector80 = openMapRealVector77.mapAbs();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = openMapRealVector63.ebeDivide(realVector80);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector82 = openMapRealVector21.add(openMapRealVector81);
        org.apache.commons.math.linear.RealVector realVector83 = openMapRealVector81.mapCosToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = openMapRealVector12.append(openMapRealVector81);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector12 and arrayRealVector13.", openMapRealVector12.equals(arrayRealVector13) == arrayRealVector13.equals(openMapRealVector12));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = openMapRealVector2.unitVector();
        openMapRealVector3.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray8 = arrayRealVector7.getDataRef();
        double double9 = arrayRealVector7.getL1Norm();
        double[] doubleArray10 = arrayRealVector7.toArray();
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector3.add(doubleArray10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray14 = arrayRealVector13.getDataRef();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector13.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector13.mapAtan();
        double double17 = arrayRealVector13.getLInfNorm();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector13.mapAddToSelf((double) (short) 100);
        double[] doubleArray20 = arrayRealVector13.data;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector3.append(doubleArray20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector21);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector13 and openMapRealVector21.", arrayRealVector13.equals(openMapRealVector21) == openMapRealVector21.equals(arrayRealVector13));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        double[] doubleArray15 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector6.data = doubleArray15;
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector6.mapAbsToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapLog1pToSelf();
        arrayRealVector19.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = arrayRealVector19.subtract(arrayRealVector24);
        double[] doubleArray33 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector24.data = doubleArray33;
        double[] doubleArray35 = arrayRealVector24.toArray();
        double double36 = arrayRealVector6.getDistance(doubleArray35);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray35, true);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray35);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector41.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector41.mapAcos();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector41.mapCbrtToSelf();
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector41.mapCeilToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray35, arrayRealVector41);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector6 and openMapRealVector39.", arrayRealVector6.equals(openMapRealVector39) == openMapRealVector39.equals(arrayRealVector6));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector0.mapTan();
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector0.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector5 = openMapRealVector0.mapExpm1ToSelf();
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray6, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector0.projection(doubleArray6);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector9, 1);
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector9.mapExpToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector13.append(openMapRealVector14);
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector14.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector17.append(openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector14.add(openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector18.append((double) 0.0f);
        double double23 = openMapRealVector18.getLInfNorm();
        double[] doubleArray24 = openMapRealVector18.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24, 3.1622776601683795d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24);
        double double28 = openMapRealVector9.getL1Distance(openMapRealVector27);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector27);
        double[] doubleArray30 = openMapRealVector27.toArray();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and arrayRealVector29.", openMapRealVector0.equals(arrayRealVector29) == arrayRealVector29.equals(openMapRealVector0));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = openMapRealVector2.unitVector();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapLog1pToSelf();
        arrayRealVector5.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = arrayRealVector5.subtract(arrayRealVector10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector10.projection(realVector15);
        double[] doubleArray17 = arrayRealVector10.toArray();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector10.mapCosToSelf();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector10.mapSignumToSelf();
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector10.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector3.append(realVector20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector21, (int) (byte) 100);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector10 and openMapRealVector21.", arrayRealVector10.equals(openMapRealVector21) == openMapRealVector21.equals(arrayRealVector10));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog1pToSelf();
        arrayRealVector7.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5, arrayRealVector7);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, (org.apache.commons.math.linear.RealVector) arrayRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector16.append(openMapRealVector17);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector17.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector20.append(openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector17.add(openMapRealVector21);
        arrayRealVector12.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapLog1pToSelf();
        arrayRealVector26.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector31.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = arrayRealVector26.subtract(arrayRealVector31);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = arrayRealVector12.subtract(arrayRealVector26);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector26.mapCoshToSelf();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector26.mapDivideToSelf((double) 10.0f);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector26.mapTanhToSelf();
        java.lang.String str39 = arrayRealVector26.toString();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector26.mapDivideToSelf(10.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector42.append(openMapRealVector43);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector42.mapTan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector46.append(openMapRealVector47);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector47.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector50.append(openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector47.add(openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector54.append(openMapRealVector55);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector54.mapTan();
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector54.mapRintToSelf();
        double double59 = openMapRealVector54.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector54, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector47.append((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator63 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry64 = openMapRealVector54.new OpenMapEntry(iterator63);
        boolean boolean66 = openMapRealVector54.isDefaultValue((double) ' ');
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector54.mapAtan();
        double[] doubleArray68 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray68, 0.0d);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector70.mapUlpToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector54.add(openMapRealVector70);
        double[] doubleArray73 = openMapRealVector72.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector42.ebeDivide(doubleArray73);
        double[] doubleArray78 = new double[] { 10, (-1.0d), (short) 0 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray78);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector80 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray73, doubleArray78);
        org.apache.commons.math.linear.RealVector realVector81 = arrayRealVector26.append(doubleArray73);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector79 and arrayRealVector80.", openMapRealVector79.equals(arrayRealVector80) == arrayRealVector80.equals(openMapRealVector79));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector0.mapTan();
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector0.mapRintToSelf();
        double double5 = openMapRealVector0.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector0, (int) (short) 0);
        double double8 = openMapRealVector0.getSparcity();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector0.mapSinh();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector0);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector10.mapPowToSelf((double) 10.0f);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and realVector12.", openMapRealVector0.equals(realVector12) == realVector12.equals(openMapRealVector0));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2, arrayRealVector4);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapLog1pToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(realVector10);
        boolean boolean12 = openMapRealVector11.isNaN();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector4 and openMapRealVector11.", arrayRealVector4.equals(openMapRealVector11) == openMapRealVector11.equals(arrayRealVector4));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        double[] doubleArray15 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector6.data = doubleArray15;
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector6.mapAbsToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapLog1pToSelf();
        arrayRealVector19.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = arrayRealVector19.subtract(arrayRealVector24);
        double[] doubleArray33 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector24.data = doubleArray33;
        double[] doubleArray35 = arrayRealVector24.toArray();
        double double36 = arrayRealVector6.getDistance(doubleArray35);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector6.mapCosToSelf();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector6.mapMultiplyToSelf(4.9E-323d);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector6.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector6.mapCosh();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector42.append(openMapRealVector43);
        org.apache.commons.math.linear.RealVector realVector45 = openMapRealVector42.mapTan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = openMapRealVector46.append(openMapRealVector47);
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector47.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = openMapRealVector50.append(openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector47.add(openMapRealVector51);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector54.append(openMapRealVector55);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector54.mapTan();
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector54.mapRintToSelf();
        double double59 = openMapRealVector54.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector54, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector47.append((org.apache.commons.math.linear.RealVector) openMapRealVector54);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator63 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry64 = openMapRealVector54.new OpenMapEntry(iterator63);
        boolean boolean66 = openMapRealVector54.isDefaultValue((double) ' ');
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector54.mapAtan();
        double[] doubleArray68 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray68, 0.0d);
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector70.mapUlpToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector72 = openMapRealVector54.add(openMapRealVector70);
        double[] doubleArray73 = openMapRealVector72.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector42.ebeDivide(doubleArray73);
        org.apache.commons.math.linear.RealVector realVector75 = arrayRealVector6.append(doubleArray73);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector76 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray73);
        org.apache.commons.math.linear.RealVector realVector77 = arrayRealVector76.mapCeilToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector42 and realVector77.", openMapRealVector42.equals(realVector77) == realVector77.equals(openMapRealVector42));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector1.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray8 = arrayRealVector7.getDataRef();
        double double9 = arrayRealVector7.getL1Norm();
        boolean boolean10 = arrayRealVector1.equals((java.lang.Object) arrayRealVector7);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector7);
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = openMapRealVector14.unitVector();
        openMapRealVector15.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray20 = arrayRealVector19.getDataRef();
        double double21 = arrayRealVector19.getL1Norm();
        double[] doubleArray22 = arrayRealVector19.toArray();
        org.apache.commons.math.linear.RealVector realVector23 = openMapRealVector15.add(doubleArray22);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray26 = arrayRealVector25.getDataRef();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector25.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector25.mapAtan();
        double double29 = arrayRealVector25.getLInfNorm();
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector25.mapAddToSelf((double) (short) 100);
        double[] doubleArray32 = arrayRealVector25.data;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector15.append(doubleArray32);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector11.projection(doubleArray32);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector25 and openMapRealVector33.", arrayRealVector25.equals(openMapRealVector33) == openMapRealVector33.equals(arrayRealVector25));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector5.append((double) 0.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        arrayRealVector11.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector11.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector11.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapLog1pToSelf();
        arrayRealVector19.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = arrayRealVector19.subtract(arrayRealVector24);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector28.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector24.projection(realVector29);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector24.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = arrayRealVector11.projection(arrayRealVector24);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector34.append(openMapRealVector35);
        arrayRealVector24.setSubVector((int) (short) 100, (org.apache.commons.math.linear.RealVector) openMapRealVector34);
        boolean boolean38 = openMapRealVector34.isNaN();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector34, (int) '#');
        double[] doubleArray41 = openMapRealVector40.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector5.append(doubleArray41);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector42);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector43.mapSinToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector40 and realVector44.", openMapRealVector40.equals(realVector44) == realVector44.equals(openMapRealVector40));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2, arrayRealVector4);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapTanhToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector9.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector9.mapAcosToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapLog1pToSelf();
        arrayRealVector14.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = arrayRealVector14.subtract(arrayRealVector19);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector14.getSubVector(10, (int) (byte) 0);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector14.mapCbrt();
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector14.mapLog10();
        double double27 = arrayRealVector9.getL1Distance((org.apache.commons.math.linear.RealVector) arrayRealVector14);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and realVector24.", openMapRealVector2.equals(realVector24) == realVector24.equals(openMapRealVector2));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog1pToSelf();
        arrayRealVector7.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5, arrayRealVector7);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, (org.apache.commons.math.linear.RealVector) arrayRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector16.append(openMapRealVector17);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector17.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector20.append(openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector17.add(openMapRealVector21);
        arrayRealVector12.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector12.mapUlpToSelf();
        double double26 = arrayRealVector12.getLInfNorm();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector12.mapExpm1ToSelf();
        arrayRealVector12.set(1.0E-12d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector31.mapLog1pToSelf();
        arrayRealVector31.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector36.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = arrayRealVector31.subtract(arrayRealVector36);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector31.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector31.checkVectorDimensions((int) (byte) 10);
        double[] doubleArray43 = arrayRealVector31.toArray();
        double double45 = arrayRealVector31.getEntry((int) (short) 0);
        double[] doubleArray46 = arrayRealVector31.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray46);
        arrayRealVector12.data = doubleArray46;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray46);
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector49.mapAsin();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector51 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = openMapRealVector51.append(openMapRealVector52);
        org.apache.commons.math.linear.RealVector realVector54 = openMapRealVector52.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double56 = openMapRealVector52.dotProduct(openMapRealVector55);
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector55.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector55.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector55.mapSignumToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector60 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = openMapRealVector60.append(openMapRealVector61);
        org.apache.commons.math.linear.RealVector realVector63 = openMapRealVector60.mapTan();
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector60.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector66 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector67 = arrayRealVector66.mapLog1pToSelf();
        arrayRealVector66.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector70 = arrayRealVector66.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector72 = arrayRealVector66.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector73 = arrayRealVector66.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector74 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector60, arrayRealVector66);
        double double75 = openMapRealVector55.getLInfDistance((org.apache.commons.math.linear.RealVector) openMapRealVector60);
        org.apache.commons.math.linear.RealVector realVector76 = openMapRealVector55.mapUlp();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector77 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector78 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector79 = openMapRealVector77.append(openMapRealVector78);
        org.apache.commons.math.linear.RealVector realVector80 = openMapRealVector77.mapTan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector81 = openMapRealVector77.copy();
        double[] doubleArray82 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray82, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector85 = openMapRealVector77.projection(doubleArray82);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector86 = openMapRealVector55.ebeDivide(doubleArray82);
        arrayRealVector49.data = doubleArray82;
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector5 and arrayRealVector49.", openMapRealVector5.equals(arrayRealVector49) == arrayRealVector49.equals(openMapRealVector5));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.append(openMapRealVector9);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector8.mapTan();
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector8.mapRintToSelf();
        double double13 = openMapRealVector8.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector8, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector1.append((org.apache.commons.math.linear.RealVector) openMapRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapLog1pToSelf();
        arrayRealVector18.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = arrayRealVector18.subtract(arrayRealVector23);
        double[] doubleArray32 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector23.data = doubleArray32;
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector23.mapAbsToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector36.mapLog1pToSelf();
        arrayRealVector36.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = arrayRealVector36.subtract(arrayRealVector41);
        double[] doubleArray50 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector41.data = doubleArray50;
        double[] doubleArray52 = arrayRealVector41.toArray();
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector23.subtract(doubleArray52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray52, true);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector1.append(doubleArray52);
        double[] doubleArray57 = openMapRealVector56.getData();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector23 and openMapRealVector56.", arrayRealVector23.equals(openMapRealVector56) == openMapRealVector56.equals(arrayRealVector23));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector1.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector1.checkVectorDimensions((int) (byte) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector15.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector15.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector15.mapAcosToSelf();
        double double19 = arrayRealVector1.getDistance(arrayRealVector15);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector15.mapUlpToSelf();
        arrayRealVector15.set((double) (short) 100);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector15.mapAcosToSelf();
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector15.mapAbsToSelf();
        boolean boolean25 = arrayRealVector15.isNaN();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector27 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector27.mapLog1pToSelf();
        arrayRealVector27.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector32.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = arrayRealVector27.subtract(arrayRealVector32);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector27.mapTan();
        int int36 = arrayRealVector27.getDimension();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector27.mapRintToSelf();
        double[] doubleArray38 = arrayRealVector27.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray38);
        double double40 = arrayRealVector15.getDistance(doubleArray38);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector39.", arrayRealVector1.equals(openMapRealVector39) == openMapRealVector39.equals(arrayRealVector1));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector4.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapLog1pToSelf();
        arrayRealVector12.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = arrayRealVector12.subtract(arrayRealVector17);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector17.projection(realVector22);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector17.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = arrayRealVector4.projection(arrayRealVector17);
        double[] doubleArray26 = arrayRealVector17.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector27.append(openMapRealVector28);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector27.mapTan();
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector27.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector33.mapLog1pToSelf();
        arrayRealVector33.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector33.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector33.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector33.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector27, arrayRealVector33);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapSqrt();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray26, arrayRealVector41);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector0.append(doubleArray26);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector45.append(openMapRealVector46);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector45.mapTan();
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector45.mapRintToSelf();
        double double50 = openMapRealVector45.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector52 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector45, (int) (short) 0);
        double double53 = openMapRealVector45.getSparcity();
        boolean boolean54 = openMapRealVector45.isInfinite();
        org.apache.commons.math.linear.RealVector realVector55 = openMapRealVector45.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector57 = openMapRealVector45.mapDivideToSelf((double) 10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector58 = openMapRealVector0.append(openMapRealVector45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector17 and openMapRealVector44.", arrayRealVector17.equals(openMapRealVector44) == openMapRealVector44.equals(arrayRealVector17));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.append(openMapRealVector9);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector8.mapTan();
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector8.mapRintToSelf();
        double double13 = openMapRealVector8.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector8, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector1.append((org.apache.commons.math.linear.RealVector) openMapRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector18.mapLog1pToSelf();
        arrayRealVector18.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = arrayRealVector18.subtract(arrayRealVector23);
        double[] doubleArray32 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector23.data = doubleArray32;
        org.apache.commons.math.linear.RealVector realVector34 = arrayRealVector23.mapAbsToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector36.mapLog1pToSelf();
        arrayRealVector36.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector41.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = arrayRealVector36.subtract(arrayRealVector41);
        double[] doubleArray50 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector41.data = doubleArray50;
        double[] doubleArray52 = arrayRealVector41.toArray();
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector23.subtract(doubleArray52);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray52, true);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = openMapRealVector1.append(doubleArray52);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector56);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector23 and openMapRealVector56.", arrayRealVector23.equals(openMapRealVector56) == openMapRealVector56.equals(arrayRealVector23));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector10.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector6.projection(realVector11);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector6.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector15 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector17 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector17.mapLog1pToSelf();
        arrayRealVector17.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector22.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = arrayRealVector17.subtract(arrayRealVector22);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector22.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = arrayRealVector15.append(arrayRealVector22);
        double[] doubleArray27 = arrayRealVector26.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector6, doubleArray27);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector6.mapAddToSelf(11.048040562939155d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector32.mapLog1pToSelf();
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray34, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector38.mapLog1pToSelf();
        arrayRealVector38.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector42 = arrayRealVector38.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector36, arrayRealVector38);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector43.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector32, (org.apache.commons.math.linear.RealVector) arrayRealVector43);
        double double46 = arrayRealVector32.getLInfNorm();
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector32.mapLog10ToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector49 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector49.mapLog1pToSelf();
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector53 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray51, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector55.mapLog1pToSelf();
        arrayRealVector55.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector59 = arrayRealVector55.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector60 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector53, arrayRealVector55);
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector60.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector62 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector49, (org.apache.commons.math.linear.RealVector) arrayRealVector60);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector64 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = openMapRealVector64.append(openMapRealVector65);
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector65.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = openMapRealVector68.append(openMapRealVector69);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector71 = openMapRealVector65.add(openMapRealVector69);
        arrayRealVector60.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector71);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector74 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector75 = arrayRealVector74.mapLog1pToSelf();
        arrayRealVector74.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector79 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector80 = arrayRealVector79.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector81 = arrayRealVector74.subtract(arrayRealVector79);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector82 = arrayRealVector60.subtract(arrayRealVector74);
        double[] doubleArray83 = arrayRealVector82.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector85 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray86 = arrayRealVector85.getDataRef();
        org.apache.commons.math.linear.RealVector realVector87 = arrayRealVector85.mapCosToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector88 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray83, arrayRealVector85);
        org.apache.commons.math.linear.RealVector realVector89 = arrayRealVector32.subtract(doubleArray83);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector90 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray83);
        double double91 = arrayRealVector6.getL1Distance(doubleArray83);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector90.", arrayRealVector1.equals(openMapRealVector90) == openMapRealVector90.equals(arrayRealVector1));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector3 = openMapRealVector2.unitVector();
        openMapRealVector3.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray8 = arrayRealVector7.getDataRef();
        double double9 = arrayRealVector7.getL1Norm();
        double[] doubleArray10 = arrayRealVector7.toArray();
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector3.add(doubleArray10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray14 = arrayRealVector13.getDataRef();
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector13.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector13.mapAtan();
        double double17 = arrayRealVector13.getLInfNorm();
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector13.mapAddToSelf((double) (short) 100);
        double[] doubleArray20 = arrayRealVector13.data;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector3.append(doubleArray20);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector3.append(2.53E-321d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector13 and openMapRealVector21.", arrayRealVector13.equals(openMapRealVector21) == openMapRealVector21.equals(arrayRealVector13));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector5.append((double) 0.0f);
        double double10 = openMapRealVector5.getLInfNorm();
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector5.mapLog10();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector12.append(openMapRealVector13);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector13.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector16.append(openMapRealVector17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector13.add(openMapRealVector17);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector17.append((double) 0.0f);
        double double22 = openMapRealVector17.getLInfNorm();
        double[] doubleArray23 = openMapRealVector17.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray23, 3.1622776601683795d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector5.append(openMapRealVector25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector27 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = openMapRealVector27.append(openMapRealVector28);
        org.apache.commons.math.linear.RealVector realVector30 = openMapRealVector27.mapTan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector31.append(openMapRealVector32);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector34.append(openMapRealVector35);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector35.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = openMapRealVector38.append(openMapRealVector39);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector35.add(openMapRealVector39);
        boolean boolean42 = openMapRealVector33.equals((java.lang.Object) openMapRealVector41);
        double double43 = openMapRealVector27.getDistance(openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector5.append(openMapRealVector33);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector46.mapLog1pToSelf();
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector50 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray48, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector52.mapLog1pToSelf();
        arrayRealVector52.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector52.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector57 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector50, arrayRealVector52);
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector57.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector59 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector46, (org.apache.commons.math.linear.RealVector) arrayRealVector57);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector62 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = openMapRealVector61.append(openMapRealVector62);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector62.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector66 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = openMapRealVector65.append(openMapRealVector66);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = openMapRealVector62.add(openMapRealVector66);
        arrayRealVector57.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector68);
        org.apache.commons.math.linear.RealVector realVector70 = arrayRealVector57.mapUlpToSelf();
        double double71 = arrayRealVector57.getLInfNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector73 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector75 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector76 = arrayRealVector75.mapLog1pToSelf();
        arrayRealVector75.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector80 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector81 = arrayRealVector80.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector82 = arrayRealVector75.subtract(arrayRealVector80);
        org.apache.commons.math.linear.RealVector realVector83 = arrayRealVector80.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector84 = arrayRealVector73.append(arrayRealVector80);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector85 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector73);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector86 = arrayRealVector57.append(arrayRealVector73);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector87 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector86);
        arrayRealVector86.set((double) (byte) -1);
        double[] doubleArray90 = arrayRealVector86.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector91 = openMapRealVector33.append(doubleArray90);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector93 = openMapRealVector33.mapAdd(512.0d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector86 and openMapRealVector91.", arrayRealVector86.equals(openMapRealVector91) == openMapRealVector91.equals(arrayRealVector86));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector0.mapTan();
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector0.mapRintToSelf();
        double double5 = openMapRealVector0.getNorm();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog1pToSelf();
        arrayRealVector7.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = arrayRealVector7.subtract(arrayRealVector12);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector12.projection(realVector17);
        double[] doubleArray19 = arrayRealVector12.toArray();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector21.mapLog1pToSelf();
        arrayRealVector21.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = arrayRealVector21.subtract(arrayRealVector26);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector21.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector21.checkVectorDimensions((int) (byte) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector21);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapLog1pToSelf();
        arrayRealVector35.set(0.0d);
        double double39 = arrayRealVector35.getL1Norm();
        org.apache.commons.math.linear.RealMatrix realMatrix40 = arrayRealVector21.outerProduct(arrayRealVector35);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector41 = arrayRealVector12.ebeDivide(arrayRealVector21);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector0, arrayRealVector41);
        org.apache.commons.math.linear.RealVector realVector44 = arrayRealVector42.mapMultiplyToSelf(0.1d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = openMapRealVector45.append(openMapRealVector46);
        org.apache.commons.math.linear.RealVector realVector48 = openMapRealVector46.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double50 = openMapRealVector46.dotProduct(openMapRealVector49);
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector49.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector52 = openMapRealVector49.mapExpm1();
        org.apache.commons.math.linear.RealVector realVector53 = openMapRealVector49.mapRint();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector55 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector56 = arrayRealVector55.mapLog1pToSelf();
        arrayRealVector55.set(0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector59 = openMapRealVector49.append((org.apache.commons.math.linear.RealVector) arrayRealVector55);
        org.apache.commons.math.linear.RealVector realVector61 = arrayRealVector55.mapSubtractToSelf((double) (-1.0f));
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector55.mapAbsToSelf();
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector55.append(3.1622776601683794E-12d);
        org.apache.commons.math.linear.RealVector realVector65 = arrayRealVector55.mapSinToSelf();
        org.apache.commons.math.linear.RealMatrix realMatrix66 = arrayRealVector42.outerProduct(arrayRealVector55);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector7 and openMapRealVector59.", arrayRealVector7.equals(openMapRealVector59) == openMapRealVector59.equals(arrayRealVector7));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        double[] doubleArray2 = arrayRealVector1.getDataRef();
        org.apache.commons.math.linear.RealVector realVector3 = arrayRealVector1.mapCosToSelf();
        double[] doubleArray4 = arrayRealVector1.getData();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4, false);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector7.", arrayRealVector1.equals(openMapRealVector7) == openMapRealVector7.equals(arrayRealVector1));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2, arrayRealVector4);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapLog1pToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(realVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector11.copy();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector4 and openMapRealVector11.", arrayRealVector4.equals(openMapRealVector11) == openMapRealVector11.equals(arrayRealVector4));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        arrayRealVector6.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = arrayRealVector6.subtract(arrayRealVector11);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, arrayRealVector11);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector14, true);
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray17, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector16, doubleArray17);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapTanh();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector23 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector24 = arrayRealVector23.mapLog1pToSelf();
        boolean boolean25 = arrayRealVector20.equals((java.lang.Object) arrayRealVector23);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector20.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector20.mapInvToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector28.append(openMapRealVector29);
        org.apache.commons.math.linear.RealVector realVector31 = openMapRealVector29.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector32.append(openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector29.add(openMapRealVector33);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = openMapRealVector36.append(openMapRealVector37);
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector36.mapTan();
        org.apache.commons.math.linear.RealVector realVector40 = openMapRealVector36.mapRintToSelf();
        double double41 = openMapRealVector36.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector36, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector29.append((org.apache.commons.math.linear.RealVector) openMapRealVector36);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator45 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry46 = openMapRealVector36.new OpenMapEntry(iterator45);
        boolean boolean48 = openMapRealVector36.isDefaultValue((double) ' ');
        org.apache.commons.math.linear.RealVector realVector49 = openMapRealVector36.mapAtan();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector51 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector51.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector51.mapSinToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector36.append((org.apache.commons.math.linear.RealVector) arrayRealVector51);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector51.mapCosToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = arrayRealVector20.append(arrayRealVector51);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector54.", arrayRealVector1.equals(openMapRealVector54) == openMapRealVector54.equals(arrayRealVector1));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog1pToSelf();
        arrayRealVector7.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5, arrayRealVector7);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, (org.apache.commons.math.linear.RealVector) arrayRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector16.append(openMapRealVector17);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector17.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector20.append(openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector17.add(openMapRealVector21);
        arrayRealVector12.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector12.mapUlpToSelf();
        double double26 = arrayRealVector12.getLInfNorm();
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector12.mapExpm1ToSelf();
        arrayRealVector12.set(1.0E-12d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector31.mapLog1pToSelf();
        arrayRealVector31.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector36.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = arrayRealVector31.subtract(arrayRealVector36);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector31.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector31.checkVectorDimensions((int) (byte) 10);
        double[] doubleArray43 = arrayRealVector31.toArray();
        double double45 = arrayRealVector31.getEntry((int) (short) 0);
        double[] doubleArray46 = arrayRealVector31.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray46);
        arrayRealVector12.data = doubleArray46;
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = new org.apache.commons.math.linear.OpenMapRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector12);
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector12.mapSin();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and openMapRealVector49.", arrayRealVector1.equals(openMapRealVector49) == openMapRealVector49.equals(arrayRealVector1));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        arrayRealVector6.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = arrayRealVector6.subtract(arrayRealVector11);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, arrayRealVector11);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector1.mapCos();
        org.apache.commons.math.linear.RealVector realVector16 = arrayRealVector1.mapUlp();
        org.apache.commons.math.linear.RealVector realVector18 = arrayRealVector1.mapAddToSelf((double) 1L);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = openMapRealVector19.append(openMapRealVector20);
        double[] doubleArray22 = openMapRealVector20.toArray();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector1.append(doubleArray22);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector24.append(openMapRealVector25);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector25.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector28.append(openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector31 = openMapRealVector25.add(openMapRealVector29);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector29.append((double) 0.0f);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector34.append(openMapRealVector35);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector34.mapTan();
        org.apache.commons.math.linear.RealVector realVector38 = openMapRealVector34.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector39 = openMapRealVector34.mapExpm1ToSelf();
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray40, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector34.projection(doubleArray40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = openMapRealVector29.subtract(doubleArray40);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray22, doubleArray40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector19 and arrayRealVector45.", openMapRealVector19.equals(arrayRealVector45) == arrayRealVector45.equals(openMapRealVector19));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector0.mapTan();
        org.apache.commons.math.linear.RealVector realVector4 = openMapRealVector0.mapRintToSelf();
        double double5 = openMapRealVector0.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector0, (int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector0.mapUlp();
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector0.mapTan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector10.append(openMapRealVector11);
        org.apache.commons.math.linear.RealVector realVector13 = openMapRealVector10.mapTan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector10.copy();
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector14.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = openMapRealVector14.append(Double.NaN);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector18.append(openMapRealVector19);
        org.apache.commons.math.linear.RealVector realVector21 = openMapRealVector18.mapTan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector18.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector14.subtract(openMapRealVector18);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector24 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector25 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = openMapRealVector24.append(openMapRealVector25);
        org.apache.commons.math.linear.RealVector realVector27 = openMapRealVector24.mapTan();
        org.apache.commons.math.linear.RealVector realVector28 = openMapRealVector24.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector24.mapExpm1ToSelf();
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray30, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector33 = openMapRealVector24.projection(doubleArray30);
        double double34 = openMapRealVector14.getL1Distance(doubleArray30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = openMapRealVector0.subtract((org.apache.commons.math.linear.RealVector) openMapRealVector14);
        java.lang.Double[] doubleArray37 = new java.lang.Double[] { 10.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray37, 1.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray37);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector43 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray37, (int) (short) 0, 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray37, (double) 1);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector47 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector47.mapLog1pToSelf();
        arrayRealVector47.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector52.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector54 = arrayRealVector47.subtract(arrayRealVector52);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector47.mapTan();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector45, arrayRealVector47);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector35.append(openMapRealVector45);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and arrayRealVector43.", openMapRealVector0.equals(arrayRealVector43) == arrayRealVector43.equals(openMapRealVector0));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector0.mapTan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = openMapRealVector0.copy();
        org.apache.commons.math.linear.RealVector realVector5 = openMapRealVector4.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector4.append(Double.NaN);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.append(openMapRealVector9);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector8.mapTan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector8.copy();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector4.subtract(openMapRealVector8);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector14.append(openMapRealVector15);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector14.mapTan();
        org.apache.commons.math.linear.RealVector realVector18 = openMapRealVector14.mapLog1p();
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector14.mapExpm1ToSelf();
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray20, 0.0d);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector14.projection(doubleArray20);
        double double24 = openMapRealVector4.getL1Distance(doubleArray20);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector26.mapLog1pToSelf();
        arrayRealVector26.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector31 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector31.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = arrayRealVector26.subtract(arrayRealVector31);
        double[] doubleArray40 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector31.data = doubleArray40;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = openMapRealVector4.append(doubleArray40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector43);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector31 and openMapRealVector43.", arrayRealVector31.equals(openMapRealVector43) == openMapRealVector43.equals(arrayRealVector31));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector6.mapLogToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        arrayRealVector11.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = arrayRealVector11.subtract(arrayRealVector16);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector22 = arrayRealVector16.projection(realVector21);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector16.mapCoshToSelf();
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector28.mapLog1pToSelf();
        arrayRealVector28.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector32 = arrayRealVector28.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector26, arrayRealVector28);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = arrayRealVector16.ebeDivide(arrayRealVector33);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector33.mapExpm1ToSelf();
        double double36 = arrayRealVector6.getLInfDistance((org.apache.commons.math.linear.RealVector) arrayRealVector33);
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector6.mapTanhToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector39 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector39.mapLog1pToSelf();
        arrayRealVector39.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector44 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector44.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = arrayRealVector39.subtract(arrayRealVector44);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector39.mapMultiplyToSelf((double) (short) 10);
        double[] doubleArray49 = arrayRealVector39.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray49, 0, (int) (byte) 10);
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector52.mapDivideToSelf((double) (byte) 1);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector52.mapAtan();
        double[] doubleArray56 = arrayRealVector52.data;
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector58 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray56, true);
        org.apache.commons.math.linear.RealVector realVector59 = arrayRealVector6.subtract(doubleArray56);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector61 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray56, 15.707963267948966d);
        org.apache.commons.math.linear.RealVector realVector63 = openMapRealVector61.mapPowToSelf(0.5d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector1 and realVector63.", arrayRealVector1.equals(realVector63) == realVector63.equals(arrayRealVector1));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector0.mapTan();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.RealVector realVector7 = openMapRealVector5.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.append(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = openMapRealVector5.add(openMapRealVector9);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = openMapRealVector12.append(openMapRealVector13);
        org.apache.commons.math.linear.RealVector realVector15 = openMapRealVector12.mapTan();
        org.apache.commons.math.linear.RealVector realVector16 = openMapRealVector12.mapRintToSelf();
        double double17 = openMapRealVector12.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector12, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = openMapRealVector5.append((org.apache.commons.math.linear.RealVector) openMapRealVector12);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator21 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry22 = openMapRealVector12.new OpenMapEntry(iterator21);
        boolean boolean24 = openMapRealVector12.isDefaultValue((double) ' ');
        org.apache.commons.math.linear.RealVector realVector25 = openMapRealVector12.mapAtan();
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector28 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray26, 0.0d);
        org.apache.commons.math.linear.RealVector realVector29 = openMapRealVector28.mapUlpToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector30 = openMapRealVector12.add(openMapRealVector28);
        double[] doubleArray31 = openMapRealVector30.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector0.ebeDivide(doubleArray31);
        double[] doubleArray36 = new double[] { 10, (-1.0d), (short) 0 };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector37 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray36);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31, doubleArray36);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector39.append(openMapRealVector40);
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector40.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector43 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector45 = openMapRealVector43.append(openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector40.add(openMapRealVector44);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector47 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector48 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector49 = openMapRealVector47.append(openMapRealVector48);
        org.apache.commons.math.linear.RealVector realVector50 = openMapRealVector47.mapTan();
        org.apache.commons.math.linear.RealVector realVector51 = openMapRealVector47.mapRintToSelf();
        double double52 = openMapRealVector47.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector47, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = openMapRealVector40.append((org.apache.commons.math.linear.RealVector) openMapRealVector47);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator56 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry57 = openMapRealVector47.new OpenMapEntry(iterator56);
        boolean boolean59 = openMapRealVector47.isDefaultValue((double) ' ');
        org.apache.commons.math.linear.RealVector realVector60 = openMapRealVector47.mapAtan();
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector63 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray61, 0.0d);
        org.apache.commons.math.linear.RealVector realVector64 = openMapRealVector63.mapUlpToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector65 = openMapRealVector47.add(openMapRealVector63);
        org.apache.commons.math.linear.RealVector realVector66 = openMapRealVector47.mapAbs();
        org.apache.commons.math.linear.RealVector realVector67 = openMapRealVector47.mapSignum();
        double[] doubleArray68 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector70 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray68, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector72 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector73 = arrayRealVector72.mapLog1pToSelf();
        arrayRealVector72.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector76 = arrayRealVector72.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector77 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector70, arrayRealVector72);
        boolean boolean78 = arrayRealVector72.isNaN();
        org.apache.commons.math.linear.RealVector realVector80 = arrayRealVector72.mapMultiplyToSelf((double) 0);
        org.apache.commons.math.linear.RealVector realVector82 = arrayRealVector72.mapPowToSelf((double) ' ');
        double[] doubleArray83 = arrayRealVector72.getDataRef();
        boolean boolean84 = openMapRealVector47.equals((java.lang.Object) doubleArray83);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector85 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray31, doubleArray83);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector37 and arrayRealVector38.", openMapRealVector37.equals(arrayRealVector38) == arrayRealVector38.equals(openMapRealVector37));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2, arrayRealVector4);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapLog1pToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(realVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector11.mapAdd(Double.POSITIVE_INFINITY);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector4 and openMapRealVector11.", arrayRealVector4.equals(openMapRealVector11) == openMapRealVector11.equals(arrayRealVector4));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2, arrayRealVector4);
        boolean boolean10 = arrayRealVector4.isNaN();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector4.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector4.mapCosh();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector14.mapLog1pToSelf();
        arrayRealVector14.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = arrayRealVector14.subtract(arrayRealVector19);
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector14.mapMultiplyToSelf((double) (short) 10);
        arrayRealVector14.checkVectorDimensions((int) (byte) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector14);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector28.mapLog1pToSelf();
        arrayRealVector28.set(0.0d);
        double double32 = arrayRealVector28.getL1Norm();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = arrayRealVector14.outerProduct(arrayRealVector28);
        double[] doubleArray34 = arrayRealVector28.getData();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray34, (double) ' ');
        double double37 = arrayRealVector4.dotProduct(doubleArray34);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector4 and openMapRealVector36.", arrayRealVector4.equals(openMapRealVector36) == openMapRealVector36.equals(arrayRealVector4));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray3, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector7 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector7.mapLog1pToSelf();
        arrayRealVector7.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector7.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector12 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector5, arrayRealVector7);
        org.apache.commons.math.linear.RealVector realVector13 = arrayRealVector12.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector14 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector1, (org.apache.commons.math.linear.RealVector) arrayRealVector12);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector17 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = openMapRealVector16.append(openMapRealVector17);
        org.apache.commons.math.linear.RealVector realVector19 = openMapRealVector17.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector20 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector21 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = openMapRealVector20.append(openMapRealVector21);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = openMapRealVector17.add(openMapRealVector21);
        arrayRealVector12.setSubVector((int) 'a', (org.apache.commons.math.linear.RealVector) openMapRealVector23);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector12.mapUlpToSelf();
        double double26 = arrayRealVector12.getLInfNorm();
        int int27 = arrayRealVector12.getDimension();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector29.mapLog1pToSelf();
        arrayRealVector29.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector34 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector35 = arrayRealVector34.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector36 = arrayRealVector29.subtract(arrayRealVector34);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector38 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector39 = arrayRealVector38.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector40 = arrayRealVector34.projection(realVector39);
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector34.mapCoshToSelf();
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector44 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray42, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector46 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector47 = arrayRealVector46.mapLog1pToSelf();
        arrayRealVector46.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector46.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector51 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector44, arrayRealVector46);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = arrayRealVector34.ebeDivide(arrayRealVector51);
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector51.mapExpm1ToSelf();
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector12.ebeMultiply((org.apache.commons.math.linear.RealVector) arrayRealVector51);
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector12.mapAtan();
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector12.mapMultiplyToSelf(1.7737756783403529d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector59 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 0);
        org.apache.commons.math.linear.RealVector realVector60 = arrayRealVector59.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = arrayRealVector12.append(arrayRealVector59);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector5 and arrayRealVector59.", openMapRealVector5.equals(arrayRealVector59) == arrayRealVector59.equals(openMapRealVector5));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2, arrayRealVector4);
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector9.mapLog1pToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector11 = new org.apache.commons.math.linear.OpenMapRealVector(realVector10);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector13 = openMapRealVector11.append(1.9155040003582885E22d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector4 and openMapRealVector11.", arrayRealVector4.equals(openMapRealVector11) == openMapRealVector11.equals(arrayRealVector4));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.append(openMapRealVector9);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector8.mapTan();
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector8.mapRintToSelf();
        double double13 = openMapRealVector8.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector8, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector1.append((org.apache.commons.math.linear.RealVector) openMapRealVector8);
        org.apache.commons.math.util.OpenIntToDoubleHashMap.Iterator iterator17 = null;
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapEntry openMapEntry18 = openMapRealVector8.new OpenMapEntry(iterator17);
        boolean boolean20 = openMapRealVector8.isDefaultValue((double) ' ');
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector23 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray21, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapLog1pToSelf();
        arrayRealVector25.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector25.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector23, arrayRealVector25);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector32 = openMapRealVector23.mapAdd(Double.NaN);
        org.apache.commons.math.linear.RealVector realVector33 = openMapRealVector32.mapRint();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = openMapRealVector8.subtract(openMapRealVector32);
        org.apache.commons.math.linear.RealVector realVector35 = openMapRealVector34.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector37 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector37.mapLog1pToSelf();
        arrayRealVector37.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector43 = arrayRealVector42.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector44 = arrayRealVector37.subtract(arrayRealVector42);
        double[] doubleArray51 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector42.data = doubleArray51;
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector42.mapAbsToSelf();
        org.apache.commons.math.linear.RealVector realVector54 = arrayRealVector42.mapLog1pToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector55 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector56 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector55.append(openMapRealVector56);
        org.apache.commons.math.linear.RealVector realVector58 = openMapRealVector55.mapTan();
        org.apache.commons.math.linear.RealVector realVector59 = openMapRealVector55.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector61.mapLog1pToSelf();
        arrayRealVector61.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector65 = arrayRealVector61.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector67 = arrayRealVector61.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector68 = arrayRealVector61.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector69 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector55, arrayRealVector61);
        double[] doubleArray70 = arrayRealVector61.toArray();
        boolean boolean71 = arrayRealVector42.equals((java.lang.Object) doubleArray70);
        org.apache.commons.math.linear.RealVector realVector72 = arrayRealVector42.mapSinToSelf();
        double[] doubleArray73 = arrayRealVector42.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector74 = openMapRealVector34.append(doubleArray73);
        boolean boolean75 = openMapRealVector74.isNaN();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector42 and openMapRealVector74.", arrayRealVector42.equals(openMapRealVector74) == openMapRealVector74.equals(arrayRealVector42));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector10 = arrayRealVector8.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector11 = arrayRealVector8.mapAcosToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector12 = openMapRealVector4.append((org.apache.commons.math.linear.RealVector) arrayRealVector8);
        int int13 = openMapRealVector4.getDimension();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector8 and openMapRealVector12.", arrayRealVector8.equals(openMapRealVector12) == openMapRealVector12.equals(arrayRealVector8));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector((int) (short) 10, 10);
        boolean boolean3 = openMapRealVector2.isNaN();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector5 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector6 = arrayRealVector5.mapLog1pToSelf();
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray7, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        arrayRealVector11.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector11.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector9, arrayRealVector11);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapSignumToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector18 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector5, (org.apache.commons.math.linear.RealVector) arrayRealVector16);
        org.apache.commons.math.linear.RealVector realVector19 = arrayRealVector5.mapExpToSelf();
        org.apache.commons.math.linear.AbstractRealVector abstractRealVector20 = arrayRealVector5.copy();
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector5.mapCeilToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector22 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) arrayRealVector5);
        double double23 = openMapRealVector2.getLInfDistance((org.apache.commons.math.linear.RealVector) arrayRealVector22);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector2 and arrayRealVector11.", openMapRealVector2.equals(arrayRealVector11) == arrayRealVector11.equals(openMapRealVector2));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector3 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector4 = arrayRealVector3.mapLog1pToSelf();
        arrayRealVector3.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector9 = arrayRealVector8.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector10 = arrayRealVector3.subtract(arrayRealVector8);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = arrayRealVector1.add(arrayRealVector10);
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector14 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray12, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector16 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector16.mapLog1pToSelf();
        arrayRealVector16.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector16.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector21 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector14, arrayRealVector16);
        boolean boolean22 = arrayRealVector16.isNaN();
        org.apache.commons.math.linear.RealVector realVector23 = arrayRealVector10.subtract((org.apache.commons.math.linear.RealVector) arrayRealVector16);
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector26 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24, 0.0d);
        org.apache.commons.math.linear.RealVector realVector27 = arrayRealVector16.append(doubleArray24);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray24);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector29 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray24);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector14 and arrayRealVector28.", openMapRealVector14.equals(arrayRealVector28) == arrayRealVector28.equals(openMapRealVector14));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector8.append(openMapRealVector9);
        org.apache.commons.math.linear.RealVector realVector11 = openMapRealVector8.mapTan();
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector8.mapRintToSelf();
        double double13 = openMapRealVector8.getNorm();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector15 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector8, (int) (short) 0);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector16 = openMapRealVector1.append((org.apache.commons.math.linear.RealVector) openMapRealVector8);
        org.apache.commons.math.linear.RealVector realVector17 = openMapRealVector1.mapSinToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector19 = openMapRealVector1.mapAddToSelf((double) (-1L));
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector22 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray20, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapLog1pToSelf();
        arrayRealVector24.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector28 = arrayRealVector24.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector29 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector22, arrayRealVector24);
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector29.mapTanhToSelf();
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector29.mapRintToSelf();
        org.apache.commons.math.linear.RealVector realVector33 = arrayRealVector29.mapDivideToSelf((double) 100L);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapLog1pToSelf();
        arrayRealVector35.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector40.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector42 = arrayRealVector35.subtract(arrayRealVector40);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector44 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector44.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector40.projection(realVector45);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector40.mapSubtract((double) 100L);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector40.mapCosh();
        boolean boolean50 = arrayRealVector40.isNaN();
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector40.mapMultiply((double) 10L);
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector29.append((org.apache.commons.math.linear.RealVector) arrayRealVector40);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector54 = openMapRealVector1.append(realVector53);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector57 = arrayRealVector56.mapLog1pToSelf();
        arrayRealVector56.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector61.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector63 = arrayRealVector56.subtract(arrayRealVector61);
        double[] doubleArray70 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector61.data = doubleArray70;
        org.apache.commons.math.linear.RealVector realVector72 = arrayRealVector61.mapAbsToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector74 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector75 = arrayRealVector74.mapLog1pToSelf();
        arrayRealVector74.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector79 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector80 = arrayRealVector79.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector81 = arrayRealVector74.subtract(arrayRealVector79);
        double[] doubleArray88 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector79.data = doubleArray88;
        double[] doubleArray90 = arrayRealVector79.toArray();
        org.apache.commons.math.linear.RealVector realVector91 = arrayRealVector61.subtract(doubleArray90);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector93 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray90, true);
        double[] doubleArray94 = arrayRealVector93.getDataRef();
        org.apache.commons.math.linear.RealVector realVector95 = openMapRealVector1.add(doubleArray94);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on realVector53 and openMapRealVector54.", realVector53.equals(openMapRealVector54) == openMapRealVector54.equals(realVector53));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray0, 0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector4 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector5 = arrayRealVector4.mapLog1pToSelf();
        arrayRealVector4.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector8 = arrayRealVector4.mapAsinToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector9 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector2, arrayRealVector4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        arrayRealVector11.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector11.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector11.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapLog1pToSelf();
        arrayRealVector19.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = arrayRealVector19.subtract(arrayRealVector24);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector28.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector24.projection(realVector29);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector24.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = arrayRealVector11.projection(arrayRealVector24);
        double[] doubleArray33 = arrayRealVector24.getDataRef();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector35 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector36 = arrayRealVector35.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector37 = arrayRealVector35.mapSinToSelf();
        org.apache.commons.math.linear.RealVector realVector38 = arrayRealVector35.mapAcosToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector39 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector41 = openMapRealVector39.append(openMapRealVector40);
        org.apache.commons.math.linear.RealVector realVector42 = openMapRealVector39.mapTan();
        org.apache.commons.math.linear.RealVector realVector43 = openMapRealVector39.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector45 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector46 = arrayRealVector45.mapLog1pToSelf();
        arrayRealVector45.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector49 = arrayRealVector45.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector51 = arrayRealVector45.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector52 = arrayRealVector45.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector53 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector39, arrayRealVector45);
        double[] doubleArray54 = arrayRealVector45.toArray();
        org.apache.commons.math.linear.RealVector realVector55 = arrayRealVector35.subtract(doubleArray54);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector56 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray33, doubleArray54);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector57 = openMapRealVector2.append(doubleArray54);
        org.apache.commons.math.linear.OpenMapRealVector.OpenMapSparseIterator openMapSparseIterator58 = openMapRealVector2.new OpenMapSparseIterator();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector45 and openMapRealVector57.", arrayRealVector45.equals(openMapRealVector57) == openMapRealVector57.equals(arrayRealVector45));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector6 = openMapRealVector4.append(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector7 = openMapRealVector1.add(openMapRealVector5);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector9 = openMapRealVector5.append((double) 0.0f);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector11 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector12 = arrayRealVector11.mapLog1pToSelf();
        arrayRealVector11.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector15 = arrayRealVector11.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector17 = arrayRealVector11.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector19 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector20 = arrayRealVector19.mapLog1pToSelf();
        arrayRealVector19.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector24 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector25 = arrayRealVector24.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector26 = arrayRealVector19.subtract(arrayRealVector24);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector28 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector29 = arrayRealVector28.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector30 = arrayRealVector24.projection(realVector29);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector24.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = arrayRealVector11.projection(arrayRealVector24);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector34.append(openMapRealVector35);
        arrayRealVector24.setSubVector((int) (short) 100, (org.apache.commons.math.linear.RealVector) openMapRealVector34);
        boolean boolean38 = openMapRealVector34.isNaN();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector40 = new org.apache.commons.math.linear.OpenMapRealVector(openMapRealVector34, (int) '#');
        double[] doubleArray41 = openMapRealVector40.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector42 = openMapRealVector5.append(doubleArray41);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector44 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector44.mapLog1pToSelf();
        arrayRealVector44.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector48 = arrayRealVector44.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector50 = arrayRealVector44.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector52 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector53 = arrayRealVector52.mapLog1pToSelf();
        arrayRealVector52.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector57 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector58 = arrayRealVector57.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector59 = arrayRealVector52.subtract(arrayRealVector57);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector61 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector62 = arrayRealVector61.mapLog1pToSelf();
        org.apache.commons.math.linear.RealVector realVector63 = arrayRealVector57.projection(realVector62);
        org.apache.commons.math.linear.RealVector realVector64 = arrayRealVector57.mapCoshToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector65 = arrayRealVector44.projection(arrayRealVector57);
        double[] doubleArray66 = arrayRealVector57.getDataRef();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector67 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector68 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector69 = openMapRealVector67.append(openMapRealVector68);
        org.apache.commons.math.linear.RealVector realVector70 = openMapRealVector67.mapTan();
        org.apache.commons.math.linear.RealVector realVector71 = openMapRealVector67.mapRintToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector73 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector74 = arrayRealVector73.mapLog1pToSelf();
        arrayRealVector73.set(0.0d);
        org.apache.commons.math.linear.RealVector realVector77 = arrayRealVector73.mapAsinToSelf();
        org.apache.commons.math.linear.RealVector realVector79 = arrayRealVector73.mapSubtract((double) (byte) 100);
        org.apache.commons.math.linear.RealVector realVector80 = arrayRealVector73.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector81 = new org.apache.commons.math.linear.ArrayRealVector((org.apache.commons.math.linear.RealVector) openMapRealVector67, arrayRealVector73);
        org.apache.commons.math.linear.RealVector realVector82 = arrayRealVector81.mapSqrt();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector83 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray66, arrayRealVector81);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector84 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray66);
        double double85 = openMapRealVector42.getL1Distance(openMapRealVector84);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector24 and openMapRealVector84.", arrayRealVector24.equals(openMapRealVector84) == openMapRealVector84.equals(arrayRealVector24));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector1 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector2 = arrayRealVector1.mapLog1pToSelf();
        arrayRealVector1.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector7 = arrayRealVector6.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector8 = arrayRealVector1.subtract(arrayRealVector6);
        double[] doubleArray15 = new double[] { (short) 0, 10.0f, 1L, '4', (byte) 0, ' ' };
        arrayRealVector6.data = doubleArray15;
        double[] doubleArray17 = arrayRealVector6.toArray();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector18 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray17);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector20 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector21 = arrayRealVector20.mapLog1pToSelf();
        arrayRealVector20.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector25 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector26 = arrayRealVector25.mapLog1pToSelf();
        arrayRealVector25.set(0.0d);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector30 = new org.apache.commons.math.linear.ArrayRealVector((int) (short) 10);
        org.apache.commons.math.linear.RealVector realVector31 = arrayRealVector30.mapLog1pToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector32 = arrayRealVector25.subtract(arrayRealVector30);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector33 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector20, arrayRealVector30);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector34 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector35 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector36 = openMapRealVector34.append(openMapRealVector35);
        org.apache.commons.math.linear.RealVector realVector37 = openMapRealVector35.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector38 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double39 = openMapRealVector35.dotProduct(openMapRealVector38);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector40 = new org.apache.commons.math.linear.ArrayRealVector(arrayRealVector33, (org.apache.commons.math.linear.RealVector) openMapRealVector38);
        org.apache.commons.math.linear.RealVector realVector41 = arrayRealVector40.mapExpm1ToSelf();
        boolean boolean42 = arrayRealVector40.isNaN();
        boolean boolean43 = arrayRealVector40.isInfinite();
        org.apache.commons.math.linear.RealVector realVector45 = arrayRealVector40.mapMultiplyToSelf((double) (short) -1);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector46 = openMapRealVector18.append((org.apache.commons.math.linear.RealVector) arrayRealVector40);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on arrayRealVector6 and openMapRealVector18.", arrayRealVector6.equals(openMapRealVector18) == openMapRealVector18.equals(arrayRealVector6));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector0 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector1 = new org.apache.commons.math.linear.OpenMapRealVector();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector2 = openMapRealVector0.append(openMapRealVector1);
        org.apache.commons.math.linear.RealVector realVector3 = openMapRealVector1.mapCeilToSelf();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector4 = new org.apache.commons.math.linear.OpenMapRealVector();
        double double5 = openMapRealVector1.dotProduct(openMapRealVector4);
        org.apache.commons.math.linear.RealVector realVector6 = openMapRealVector4.mapInvToSelf();
        org.apache.commons.math.linear.RealVector realVector8 = openMapRealVector4.mapDivideToSelf((double) (short) -1);
        org.apache.commons.math.linear.RealVector realVector9 = openMapRealVector4.mapSinh();
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector10 = openMapRealVector4.copy();
        double double11 = openMapRealVector4.getNorm();
        org.apache.commons.math.linear.RealVector realVector12 = openMapRealVector4.mapUlpToSelf();
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector13 = new org.apache.commons.math.linear.ArrayRealVector(realVector12);
        org.apache.commons.math.linear.RealVector realVector14 = arrayRealVector13.mapExpm1ToSelf();
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector0 and realVector14.", openMapRealVector0.equals(realVector14) == realVector14.equals(openMapRealVector0));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        java.lang.Double[] doubleArray4 = new java.lang.Double[] { 0.0d, (-1.0d), (-1.0d), 100.0d };
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector5 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4);
        org.apache.commons.math.linear.ArrayRealVector arrayRealVector6 = new org.apache.commons.math.linear.ArrayRealVector(doubleArray4);
        org.apache.commons.math.linear.OpenMapRealVector openMapRealVector8 = new org.apache.commons.math.linear.OpenMapRealVector(doubleArray4, 38.89348302210285d);
        // This assertion (symmetry of equals) fails
        org.junit.Assert.assertTrue("Contract failed: equals-symmetric on openMapRealVector5 and arrayRealVector6.", openMapRealVector5.equals(arrayRealVector6) == arrayRealVector6.equals(openMapRealVector5));
    }
}

