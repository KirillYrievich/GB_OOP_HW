package org.example.lesson7;

public class Divide extends ComplexNumber implements DivideContract{
    public Divide(float _a, float _b) {
        super(_a, _b);
    }

    @Override
    //Деление
    public ComplexNumber divide(ComplexNumber otherNumber){
        newA = ((a * otherNumber.getA()) + (b * otherNumber.getB())) / ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
        newB = ((b * otherNumber.getA()) - (a * otherNumber.getB())) / ((otherNumber.getA() * otherNumber.getA()) + (otherNumber.getB() * otherNumber.getB()));
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }
}