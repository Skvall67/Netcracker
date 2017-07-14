package com.netcracker.edu.java.tasks;

/**
 * Created by i.ruzhentsev on 14.07.2017.
 */
public class ComplexNumberImpl implements ComplexNumber{
    private double re, im;

    public ComplexNumberImpl(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public ComplexNumberImpl(String value) {

    }

    public ComplexNumberImpl() {}

    public static void main(String[] args) {

    }

    @Override
    public double getRe() {
        return re;
    }

    @Override
    public double getIm() {
        return im;
    }

    @Override
    public boolean isReal() {
        if (im == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void set(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public void set(String value) throws NumberFormatException {

    }

    @Override
    public ComplexNumber copy() {

        return null;
    }

    @Override
    public ComplexNumber clone() throws CloneNotSupportedException {
        ComplexNumber clone = this.clone();
        return clone;
    }

    @Override
    public String toString() {
        if (im == 0) {
            return re + "";
        } else if (re == 0) {
            return im + "i";
        } else {
            return "" + re + im + "i";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComplexNumberImpl that = (ComplexNumberImpl) o;

        if (Double.compare(that.re, re) != 0) return false;
        return Double.compare(that.im, im) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(re);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(im);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public int compareTo(ComplexNumber other) {
        double first = re * re + im * im;
        double sRe = other.getRe(), sIm = other.getIm();
        double second = sRe * sRe + sIm * sIm;
        if (first < second) {
            return -1;
        } else if (first == second) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public void sort(ComplexNumber[] array) {
        ComplexNumber k;
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1].compareTo(array[j]) == 1) {
                    k = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = k;
                }
            }
        }
    }

    @Override
    public ComplexNumber negate() {
        return null;
    }

    @Override
    public ComplexNumber add(ComplexNumber arg2) {
        return null;
    }

    @Override
    public ComplexNumber multiply(ComplexNumber arg2) {
        return null;
    }
}
