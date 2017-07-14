package ru.ncedu.java.tasks;

import java.util.Arrays;

/**
 * Created by i.ruzhentsev on 13.07.2017.
 */
public class ArrayVectorImpl implements ArrayVector {
    private double[] array;
    public ArrayVectorImpl(){
        array = new double[16];
    }

    public ArrayVectorImpl(int count){
        array = new double[count];
    }

    public static void main(String[] args) {

    }

    @Override
    public void set(double... elements) {
        array = Arrays.copyOf(array, elements.length);
        for (int i = 0; i < array.length; i++) {
            array[i] = elements[i];
        }
    }

    @Override
    public double[] get() {
        return array;
    }

    @Override
    public ArrayVector clone() {
        ArrayVector vect = new ArrayVectorImpl();
        vect.set(array.clone());
        return vect;
    }

    @Override
    public int getSize() {
        return array.length;
    }

    @Override
    public void set(int index, double value) {
        if (index < 0) {

        } else if (index >= array.length) {
            array = Arrays.copyOf(array, index + 1);
            array[index] = value;
        } else {
            double[] mass = Arrays.copyOfRange(array, index, array.length);
            array[index] = value;
            for (int i = index + 1; i < mass.length; i++) {
                array[i] = mass[i];
            }
        }
    }

    @Override
    public double get(int index) throws ArrayIndexOutOfBoundsException {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return array[index];
        }
    }

    @Override
    public double getMax() {
        double max = array[0];
        for (double d : array) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    @Override
    public double getMin() {
        double min = array[0];
        for (double d : array) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    @Override
    public void sortAscending() {
        double k;
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    k = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = k;
                }
            }
        }
    }

    @Override
    public void mult(double factor) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= factor;
        }
    }

    @Override
    public ArrayVector sum(ArrayVector anotherVector) {
        double[] mass = Arrays.copyOf(anotherVector.get(), array.length);
        for (int i = 0; i < array.length; i++) {
            array[i] += mass[i];
        }
        return this;
    }

    @Override
    public double scalarMult(ArrayVector anotherVector) {
        double[] mass = anotherVector.get();
        int length;
        double scalarMult = 0;
        if (anotherVector.getSize() > array.length) {
            mass = Arrays.copyOf(anotherVector.get(), array.length);
            length = array.length;
        } else {
            array = Arrays.copyOf(array, anotherVector.getSize());
            length = anotherVector.getSize();
        }
        for (int i = 0; i < length; i++) {
            scalarMult += array[i] * anotherVector.get(i);
        }
        return scalarMult;
    }

    @Override
    public double getNorm() {
        double scalarMult = 0;
        for (int i = 0; i < array.length; i++) {
            scalarMult += array[i] * array[i];
        }
        double norm = Math.sqrt(scalarMult);
        return norm;
    }
}
