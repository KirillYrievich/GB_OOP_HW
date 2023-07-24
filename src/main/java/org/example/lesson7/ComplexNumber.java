package org.example.lesson7;

class ComplexNumber {
    protected float a;
    protected float b;
    protected float newA;
    protected float newB;
    ComplexNumber newComplex;

    public ComplexNumber(float _a, float _b) {
        a = _a;
        b = _b;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }


    public String toString() {
        return "(" + a + ") + (" + b + ")i";
    }
}