package org.example.lesson7;

public class Multiply extends ComplexNumber implements MultiplyContract{

    public Multiply(float _a, float _b) {
        super(_a, _b);
    }

    @Override
    //Умножение
    public ComplexNumber multiply(ComplexNumber otherNumber){
        newA = (a * otherNumber.getA()) - (b * otherNumber.getB());
        newB = (b * otherNumber.getA()) + (a * otherNumber.getB());
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }
}