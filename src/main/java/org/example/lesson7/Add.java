package org.example.lesson7;

public class Add extends ComplexNumber implements AddContract{

    public Add(float _a, float _b) {
        super(_a, _b);
    }

    @Override
    //Сложение
    public ComplexNumber add(ComplexNumber otherNumber){
        newA = a + otherNumber.getA();
        newB = b + otherNumber.getB();
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }
}